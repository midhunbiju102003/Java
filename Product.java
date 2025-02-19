public class Product {
    int pcode;
    String pname;
    double price;

    Product(int pcode,String pname,double price){

         this.pcode=pcode;
         this.pname=pname;
         this.price=price;
    }
    void display(){
        System.out.println("product code:"+ this.pcode);
        System.out.println("product name:"+ this.pname);
        System.out.println("product price:"+this.price);
        System.out.println("..........................");
    }
    public static void main(String[] args) {
        
        Product p1 = new Product(101,"Laptop",55000);
        Product p2 = new Product(102,"TV",44450);
        Product p3 = new Product (103,"Watch",10000);
        System.out.println("...Product Details...");
        p1.display();
        p2.display();
        p3.display();
        Product p4;
        if(p1.price < p2.price && p1.price < p3.price){
            p4 = p1;
        }else if (p2.price < p3.price){
            p4 = p2;
        }else{
            p4 = p3;
        }

        System.out.println("Product the lowest cost:");
        p4.display();
    }
}
