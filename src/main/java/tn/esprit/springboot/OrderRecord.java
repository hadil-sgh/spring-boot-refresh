package tn.esprit.springboot;


    //IMPORTANT:
    // The difference between a Class an a Record ==>
    // 💡 Records come with automatically generated methods like equals setter,getter ...
    // ⚠️ While records are ideal for simple data carriers, classes offer greater flexibility for more complex object-oriented designs.

public record OrderRecord(
        String customerName,
        String productName,
        int quantity
) {

}
