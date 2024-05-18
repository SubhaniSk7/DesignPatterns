package structural.composite;

import structural.decorator.example1.Coffee;
import structural.decorator.example1.NormalCoffee;
import structural.decorator.example1.StrongCoffee;
import structural.decorator.example1.SugarCoffee;
import structural.decorator.example2.DataSource;
import structural.decorator.example2.FileDataSource;
import structural.decorator.example2.LowerCaseDecorator;
import structural.decorator.example2.UpperCaseDecorator;

public class CompositeClientCode {
    public void execute() {
        File file = new File("one.java");

        Directory directory1 = new Directory("Books");
        directory1.add(new File("Analysis of Algorithms.pdf"));

        Directory rootDirectory = new Directory("Work");
        rootDirectory.add(file);
        rootDirectory.add(directory1);

        rootDirectory.display();

        // Decorator pattern
        System.out.println("-------------Decorator pattern-------------");
        Coffee coffee = new NormalCoffee();
        System.out.println(coffee.getDescription() + " Cost:" + coffee.cost());

        coffee = new StrongCoffee(coffee);
        System.out.println(coffee.getDescription() + " Cost:" + coffee.cost());

        coffee = new SugarCoffee(coffee);
        System.out.println(coffee.getDescription() + " Cost:" + coffee.cost());

        DataSource fileDataSource = new FileDataSource("Text.txt");
        String data = "SuBhAnI";
        fileDataSource.writeData(data);
        System.out.println(fileDataSource.readData());

        fileDataSource = new LowerCaseDecorator(fileDataSource);
        fileDataSource.writeData(data);
        System.out.println(fileDataSource.readData());

        fileDataSource = new UpperCaseDecorator(fileDataSource);
        fileDataSource.writeData(data);
        System.out.println(fileDataSource.readData());
    }
}
