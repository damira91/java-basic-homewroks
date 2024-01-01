package ru.kudaiberdieva.homeworks.homework19.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) {
        try {
            while (true) {
                ServerSocket serverSocket = new ServerSocket(8890); // подключаемся к серверу
                Socket socket = serverSocket.accept();  // сервер подтверждает подключение и ждет пока
                try {
                    System.out.println("Client connected"); // сообщение подтверждения подключения клиента
                    DataInputStream dataInFromClient = new DataInputStream(socket.getInputStream());
                    DataOutputStream dataOutToClient = new DataOutputStream(socket.getOutputStream());
                    int operation = dataInFromClient.readInt();
                    double figure1 = dataInFromClient.readDouble();
                    double figure2 = dataInFromClient.readDouble();
                    double result = calculate(operation, figure1, figure2);

                    dataOutToClient.writeDouble(result);
                    socket.getOutputStream().flush();
                } catch (IOException e) {
                    e.getMessage();
                }
                finally {
                    socket.close();
                    serverSocket.close();
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static double calculate( int operation, double figure1, double figure2) {

        switch (operation) {
            case 1:
                return figure1 + figure2;
            case 2:
                return figure1 - figure2;
            case 3:
                return figure1 * figure2;
            case 4:
                if (figure2 != 0) {
                    return figure1 / figure2;
                } else {
                    System.out.println("division by zero is invalid");
                    return 0;
                }
            default:
                System.out.println("Error invalid operation");
                return 0;
        }
    }
}
