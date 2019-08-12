package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    Random rand = new Random();
	int[] ciagLicznNIP = new int[rand.nextInt(100+1)+1];
	int dlugoscSekcjiLiczbNieparzystych = rand.nextInt(100+1)+1;
	int liczbaNieparzysta;
	int liczbaParzysta;
	int lewo;
	int prawo;
	int srodek;
	while(true){ // sprawdzenie czy ilosc liczb nieparzystych nie jest wieksza niz dlugosc tabeli
	    if(dlugoscSekcjiLiczbNieparzystych >=ciagLicznNIP.length){
            dlugoscSekcjiLiczbNieparzystych = rand.nextInt(100+1)+1;
        }
        else{
            break;
        }
    }
	for (int i=0; i<dlugoscSekcjiLiczbNieparzystych; i++){ //umieszczenie liczb nieparzystych do tabeli
	    liczbaNieparzysta = rand.nextInt(100+1)+1;
	    if (liczbaNieparzysta % 2 != 0) {
            ciagLicznNIP[i] = liczbaNieparzysta;
        }
	    else{
	        i--;
        }
    }
	for (int j=dlugoscSekcjiLiczbNieparzystych; j<ciagLicznNIP.length; j++){ //j.w tylko z parzystymi
	    liczbaParzysta = rand.nextInt(100+1)+1;
	    if (liczbaParzysta % 2 ==0) {
	        ciagLicznNIP[j] = liczbaParzysta;
        }
	    else{
	        j--;
        }
    }
	System.out.println("Ilosc elementow w ciagu" + ciagLicznNIP.length);
	for (int j : ciagLicznNIP){ //wyrzucenie elementow tablicy na ekran
	    System.out.print(j + " ");
	}
	// ALGORYTM SORTOWANIA BINARNEGO
	lewo = 0;
	prawo = ciagLicznNIP.length - 1;
	srodek = (lewo + prawo)/2;
	if (srodek % 2 !=0){
	    srodek += 1;
	}
	// 1.jesli srodek = N i srodek+1 = N to srodek = lewo
    // 2.jesli srodek = N i srodek+1 = P to znaleziono
    // 3.jesli srodek = P i srodek-1 = P to srodek = prawo
    // 4.jesli srodek = P i srodek-1 = N to znaleziono
        System.out.println();
	for(;;){
	    srodek = (lewo + prawo)/2;

        System.out.println("Srodek tego szukania to: " + ciagLicznNIP[srodek]);

	    if ((ciagLicznNIP[srodek] % 2 != 0)&&(ciagLicznNIP[srodek+1] % 2 !=0)){
	        lewo = srodek;
        }
	    else if((ciagLicznNIP[srodek] % 2 !=0)&&(ciagLicznNIP[srodek+1] % 2 ==0)){
            System.out.println("Znaleziono! Pierwsza liczba parzysta to: " + ciagLicznNIP[srodek+1]);
            break;
        }
	    else if((ciagLicznNIP[srodek] % 2 == 0)&&(ciagLicznNIP[srodek-1] % 2 ==0)){
	        prawo = srodek;
        }
	    else if((ciagLicznNIP[srodek] % 2 == 0)&&(ciagLicznNIP[srodek-1] % 2 !=0)){
            System.out.println("Znaleziono! Pierwsza liczba parzysta to: " + ciagLicznNIP[srodek]);
            break;
        }
    }
    }
}
