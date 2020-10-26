/**
 * Name: Nhung Nguyen  
 * Date: 10/25/2020
 * Class: CS 226 009 Data Structures and Algorithms
 * Assignment6: Chapter 6: Caves
 * Purpose:  Demonstrate adding, removing and listing caves.
 */
package nnguyen;

import java.util.Scanner;

public class CaveStackDemo {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		CaveInterface<String> Tunnel = new CaveStack<>();
		/*System.out.println("Enter a cave name: ");
		String caveName = sc.nextLine();
		System.out.println("Enter the longitude: ");
		double longitude = sc.nextDouble();
		System.out.println("Enter the latitude: ");
		double latitude = sc.nextDouble();
		Tunnel.push(caveName, longitude, latitude);*/
		Tunnel.push("Son Doong", 70, 30);
		Tunnel.push("Blue Grotto", 80, 90);
		Tunnel.push("Luray", 100, 50);
		Tunnel.push("Batu", 30, 90);
		Tunnel.push("Ice Cave", 50, 60);
		display(Tunnel);
		
		System.out.print("Remove the last cave entry.");
		Tunnel.pop();
		display(Tunnel);

		System.out.print("Remove the last cave entry.");
		Tunnel.pop();
		display(Tunnel);

	}
	private static void display(CaveInterface<String> Tunnel) {
		Object[] display = ((CaveStack<String>) Tunnel).toArray();
		if(display.length == 0){
			System.out.println("There is no cave in the system.");
		}else {
			System.out.println("The tunnel consists of: " + " ");
			for (int i = 0; i < display.length; i++) {
				System.out.print(display[i]);
				System.out.println("\n");
			}
		}

	}

}
