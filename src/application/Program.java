package application;

import model.entities.Department;
import org.w3c.dom.ls.LSOutput;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        System.out.println(obj);

    }
}
