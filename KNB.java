package com.knb;

import java.util.Scanner;
import java.util.Random;

public class KNB {
  static Scanner sc = new Scanner(System.in);
  static Random r = new Random();
  static String a[] = {"rock", "scissors", "paper"};

  public static void main(String[] args) {
    while (true) {
      System.out.print("Rock, scissors, paper\nYou: ");
      ans();
      System.out.print("Bot: " + a[r.nextInt(3)] + "\nDo you wanna replay? yes/no\n");
      if (!YN()) System.exit(0);
    }
  }

  public static void ans() {
    switch (sc.next()) {
      case "scissors":
      case "rock":
      case "paper":
        break;
      default:
        System.out.print("rock, scissors or paper\n");
        ans();
    }
  }

  public static boolean YN() {
    switch (sc.next()) {
      case "yes":
        return true;
      case "no":
        return false;
      default:
        System.out.print("yes or no\n");
        return YN();
    }
  }
}
