import java.util.Scanner;

public class ContactWorkers
{
    public static void Main(String[] args){
        // Each of the workers/advisors is created. NOTE that the workers are distributed by regions but they can make ships(all kind) if some of workers are busy!!!!

        Workers abroadworker = new AbroadWorker();
        Workers bulgarianworker = new BulgarianWorker();
        Workers plovdivworker = new PlovdivWorker();
        
        // Rare case: We establish that these are not available to serve people for concrete region.  Then do the following to prevent conflict:
        abroadworker.setAvailable(false);
        bulgarianworker.setAvailable(false);
        
        // We establish the following advisor to be contacted in
        // in case the first one is busy
        abroadworker.setNext(bulgarianworker);
        bulgarianworker.setNext(plovdivworker);
        
 
        // We initiate the dialogue and ask for a response
        Scanner reader = new Scanner(System.in);
        System.out.println("Do you want to contact an another advisor/workder (yes/no)?");
        String answer = reader.nextLine();
        
        if(answer.equals("yes")){
            System.out.println("Please wait a couple of minutes while one of our advisors in the office come to serve you ...");
            System.out.println("\n(--Establishing connection with a free member of our workers--) \n");
            asesor1.contactar();//Here we trying to contact the first advisor 
        }else{
            System.out.println("We are sorry, we will always be there to serve you any other time, have a happy day.");
        }
    }
}
