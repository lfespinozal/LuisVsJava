package Core.Generics;


public class Generics {
    
    public static void main(String[] args) throws Exception {
        

        //Generics
        System.out.println("--------> Generics <--------");
        Store<String> storeString =  new Store<String>();
        storeString.setIntem("Luis");
        System.out.println(storeString.getIntem());

        
        Store<Integer> storeInteger =  new Store<Integer>();
        storeInteger.setIntem(1);
        System.out.println(storeInteger.getIntem()); 

        //Multiple generics
        System.out.println("--------> Muliple Generics <--------");
        Hashtable<String, Integer> hashtable 
            = new Hashtable<String,Integer>("Hello", 1);

        System.out.println(hashtable.getKey() + hashtable.getValue());


        //Generic in methods
        System.out.println("--------> Generics methods  <--------");
        GenericMethod genericMethod =  new GenericMethod();
        genericMethod.showItem(1);
        genericMethod.showItem("Hola");
        genericMethod.showItem(true);

        //Multiple values
        System.out.println("--------> Multiple values <--------");

        genericMethod.printItems("Adams", 1);

        Integer[] nums =  {1,2,3,4,5,};
        genericMethod.showItems(nums);
        String[] names = {"Luis","Fernando"};
        genericMethod.showItems(names);

        //Bouded Generics
        System.out.println("--------> Bounbded Generics <--------");
        System.out.println(GenericMethod.calculateMin(8, 2));
    }
}
