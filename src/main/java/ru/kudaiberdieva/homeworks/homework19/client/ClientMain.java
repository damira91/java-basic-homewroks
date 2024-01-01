package ru.kudaiberdieva.homeworks.homework19.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 8890);
            DataOutputStream dataOutToServer = new DataOutputStream(socket.getOutputStream());// отправляет исхоящий поток
            DataInputStream dataInFromServer = new DataInputStream(socket.getInputStream());// принимает входящий поток
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose following operations: +, -, *, /");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Enter 0 to exit.");
            while (true) {
                System.out.println("Enter choice");
                int operation = scanner.nextInt();
                System.out.println("Enter first operand: ");
                double operand1 = scanner.nextDouble();
                System.out.println("Enter second operand: ");
                double operand2 = scanner.nextDouble();
                dataOutToServer.writeInt(operation);
                dataOutToServer.writeDouble(operand1);
                dataOutToServer.writeDouble(operand2);
                socket.getOutputStream().flush();
                double result = dataInFromServer.readDouble();
                System.out.println("Result: " + result);
                if(operation == 0){
                    socket.close();
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}

