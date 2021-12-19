package com.usingexceptions;

import com.usingexceptions.exceptions.InvalidINNFormatException;
import com.usingexceptions.exceptions.UserNotFoundException;
import com.usingexceptions.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        performAction();
    }

    static void performAction() {
        System.out.println("0 - add user\n1 - find user by INN");
        Scanner in = new Scanner(System.in);
        int action = in.nextInt();
        switch (action) {
            case 0:
                try {
                    addUser();
                } catch (InvalidINNFormatException e) {
                    e.printStackTrace();
                }
                break;
            case 1:
                String userName = null;
                try {
                    userName = findUserByINN(in.next());
                } catch (UserNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println(userName);
                break;
        }
        performAction();
    }

    static void addUser() throws InvalidINNFormatException {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String INN = in.next();
        if (INN.length() != 10 && INN.length() != 12) {
            throw new InvalidINNFormatException(
                    "The INN must consist of 10 or 12 digits");
        }
        users.add(new User(name, INN));
    }

    static String findUserByINN(String INN) throws UserNotFoundException {
        for (User user : users) {
            if (user.getINN().equals(INN)) {
                return user.getName();
            }
        }
        throw new UserNotFoundException(
                "Could not find user with INN " + INN);
    }
}
