package com.rsp;

import java.util.Random;
import java.util.Scanner;

class RSP {
  private static final Scanner sc = new Scanner(System.in);
  private static final Random r = new Random();
  private static final String[] a = {"rock", "scissors", "paper"};

  public static void main(String[] args) {
    while (true) {
      System.out.print("Rock, scissors, paper\nYou: ");
      ans();
      System.out.print("Bot: " + a[r.nextInt(3)] + "\nDo you wanna replay? yes/no\n");
      if (!YN()) System.exit(0);
    }
  }

  private static void ans() {
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

  private static boolean YN() {
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
