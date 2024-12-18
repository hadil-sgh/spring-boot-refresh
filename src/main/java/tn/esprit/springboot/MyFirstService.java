package tn.esprit.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass myFirstClass;
    private Environment environment;

    //IMPORTANT
    // @Autowired   ==> Filed injection ==> not good for Testing and isolation
    //@Qualifier("mySecondClass")
    //@Qualifier("Bean1")

    // NOTE:
    //  This is a Method Injection can take one or more methods or injections
//    @Autowired
//    public void injectDependencies(@Qualifier("bean1") MyFirstClass myFirstClass) {
//         this.myFirstClass = myFirstClass;
//    }

    // NOTE:
    // Setter Injection
    @Autowired
    public void setMyFirstClass(@Qualifier("bean2") MyFirstClass myFirstClass){
        this.myFirstClass=myFirstClass;
    }

    public String tellAStory() {
        return "the dependency said :" + myFirstClass.sayHello();
    }

    public String getJavaVersion() {
        return environment.getProperty("java.version");
    }
    public String getOsName() {
        return environment.getProperty("os.name");
    }

    public Environment getEnvironment() {
        return environment;
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
