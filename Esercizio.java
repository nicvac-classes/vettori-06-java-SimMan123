//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
      Scanner in = new Scanner (System.in);
      int n,i,imin;
      System.out.print("numero atleti in gara");
      n = in.nextInt();
      String nomi[] = new nomi[n];
      String naz[] = new naz[n];
      double tem[]= new tem[n];
      for (i=0;i<n;i++) {
        nomi[i]=in.nextLine();
        naz[i]=in.nextLine();
        tem[i]= in.nextDouble();
      }
      imin=0;
      for(i=0;i<n;i++) {
        if ( tem[i]<tem[imin]) {
            imin=i;
        }
      }
      System.out.print("nome : " + nomi[imin]);
      System.out.print("nazionale : " + naz[imin]);
      System.out.print("tempo : " + tem[imin]);
    }
}

