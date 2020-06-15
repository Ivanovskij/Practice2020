package org.practice2020.serialization;

import java.io.*;

public class ExampleSerializable implements Serializable {

    private int a;
    private String hello;

    public ExampleSerializable(int a, String hello) {
        System.out.println("Constructor with all parameters");
        this.a = a;
        this.hello = hello;
    }

    @Override
    public String toString() {
        return "ExampleSerializable{" +
                "a=" + a +
                ", hello='" + hello + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ExampleSerializable example = new ExampleSerializable(14, "Hello");

        System.out.println("Before Serialization: " + example);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(example);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        ExampleSerializable from = (ExampleSerializable) ois.readObject();

        System.out.println("After Deserialization: " + from);
    }

}
