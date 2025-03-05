public class Cpu {
    double price;
    Cpu(double price){
        this.price=price;
    }
    public void printinfo(){
        System.out.println("Cpu Price is:"+price);
    }
    class Processor{
        int core;
        String manufacturer;
        Processor(int core,String manufacturer){
            this.core=core;
            this.manufacturer=manufacturer;
        }
        public void printinfo(){
            System.out.println("Cores:"+core);
            System.out.println("Manufacturer:"+manufacturer);
        }
    }
    public static class Ram{
        int memory;
        String manufacturer;
        Ram(int memory,String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        public void printinfo(){
            System.out.println("Ram memory:"+memory+"GB");
            System.out.println("Ram manufacturer:"+manufacturer);
        }
    }
    public static void main(String[] args) {
        Cpu cpu1 = new Cpu(300);
        Cpu.Processor processor1 = cpu1.new Processor(4,"Intel");
        Cpu.Ram ram1 = new Cpu.Ram(8,"Corsair");
        cpu1.printinfo();
        processor1.printinfo();
        ram1.printinfo();
    }
}
