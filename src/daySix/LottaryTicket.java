package daySix;

import java.util.Random;

public class LottaryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    // Method to generate random ticket numbers
    public static int[] generateTicketNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) ;
        }

        return ticket;
    }
    public  static  void  printTicket(int [] ticket){

        for (int i =0;i<LENGTH;i++)
        {
            System.out.println(ticket[i]);
        }
    }

    }