public class LaundryMachineFuntions {

    //atributos
    private int kilos;
    private int full=0;

    private int clothesType=0;

    private int cycleComplete=0;

    private int dryComplete=0;


    //Contructor
    public LaundryMachineFuntions(int kilos,int clotheTypes){
        this.kilos=kilos;
        this.clothesType=clotheTypes;
    }

    //Methodos
    private void filling(){

        if(kilos<=12){
            full =1;
            System.out.println("llenado!!!");
            System.out.println("Llenado completo!!!");
        }
        else{
            System.out.println("The load of clothes is too heavy, please remove some clothes!!!");
        }
    }

    private void washing(){

        filling();
        if(full==1){
            if(clothesType==1){
                System.out.println("You have selected <strong>white<strong> clothes washing");
                System.out.println("Starting Washing...");
                cycleComplete=1;
            }
            else if(clothesType==2){
                System.out.println("You have selected <strong>Color<strong> clothes washing");
                System.out.println("Starting Washing...");
                cycleComplete=1;
            }
            else{
                System.out.println("This kind of clothes is not available.");
                System.out.println("The clothes will be wash as Color clothes");
                System.out.println("Starting Washing...");
                cycleComplete=1;
            }
        }
    }

    private void dryer(){
        washing();
        if(cycleComplete==1){
            System.out.println("Drying!!!");
            dryComplete =1;
        }
    }

    public void doneWashing(){
        dryer();
        if(dryComplete==1){
            System.out.println("The washer machine has finished the whasing and drying process succesfully!!");
        }
    }

    // setters and getters


    public int getClothesType() {
        return clothesType;
    }

    public void setClothesType(int clothesType) {
        this.clothesType = clothesType;
    }
}
