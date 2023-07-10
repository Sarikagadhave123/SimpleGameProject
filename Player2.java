public class Player2 extends Player1{
    private int healht;
    private boolean armoor;

    public Player2(String name, String weapon,int healht, boolean armoor) {
        super(name,weapon,healht);
        this.healht = healht;
        this.armoor = armoor;
    }

    @Override
    public void damageByGun1() {
        if(armoor){
            this.healht-=20;
            if(this.healht<=0)this.healht=0;
            System.out.println("Armoor is on.Got hit by gun 1.health is reduced by 20." + "New health is" + this.healht);
        }
        if(armoor){
            this.healht-=30;
            if(this.healht<=0)this.healht=0;
            System.out.println("Armoor is off.Got hit by gun 1.health is reduced by 30." + "New health is" + this.healht);
        }
        if(this.healht==0){
            System.out.println(getName()+"is dead");
        }
    }

    @Override
    public void damageByGun2() {
        if(armoor){
            this.healht-=40;
            if(this.healht<=0)this.healht=0;
            System.out.println("Armoor is on.Got hit by gun1.health is reduced by 40." + "New health is" + this.healht);
        }
        if(armoor){
            this.healht-=50;
            if(this.healht<=0)this.healht=0;
            System.out.println("Armoor is off.Got hit by gun1.health is reduced by 50." + "New health is" + this.healht);
        }
        if(this.healht==0){
            System.out.println(getName()+"is dead");
        }


    }

    @Override
    public void heal() {
        super.heal();
    }
}
