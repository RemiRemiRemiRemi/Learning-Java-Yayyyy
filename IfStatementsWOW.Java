/*Hey guys so it's 1:31am and I'm learning Java so that I can be really cool.
Hopefully my sleep paralysis demon doesn't visit me tonight.*/
public class Main{
public static void main(String[]args){

//if true then it will run I guess

/*if you have a lot of fish, then it will ask why. If you don't, then it's reasonable.
If you own an absurd amount, then it's absurd.
If you have one fish, then you have one. Wow.*/
    int numberFish = 99;

    if(numberFish >= 200){
        System.out.println("You have an ABSURD amount of fish");
    }
    else if(numberFish >= 100){
        System.out.println("Why do you have so many fish?");
    }
    else if (numberFish == 1){
        System.out.println("Wow, you have exactly one fish");
    }
    else {
        System.out.println("You own a perfectly reasonable amount of fish");
    }

    }

}