import java.util.*;

public class stac {
    // Stack is a part of an array list . Last in first Out.
    // Push means adding element and pop means removing element,
    public static void main(String[] args) {
        Stack<String> animalStack = new Stack<>();
        animalStack.push("Dog");
        animalStack.push("Giraffe");
        animalStack.push("Zebra");
        animalStack.push("Kangaroo");
        animalStack.push("Panda");
        animalStack.push("Koala");
        animalStack.push("Cheetah");
        animalStack.push("Leopard");
        animalStack.push("Rhinoceros");
        animalStack.push("Hippopotamus");
        animalStack.push("Crocodile");
        animalStack.push("Alligator");
        animalStack.push("Penguin");
        animalStack.push("Polar Bear");
        animalStack.push("Grizzly Bear");
        animalStack.push("Wolf");
        animalStack.push("Fox");
        animalStack.push("Deer");
        System.out.println(animalStack);

        // to check which element is at the top we use the function of peak .
        System.out.println(animalStack.peek());
        animalStack.pop();
        System.out.println(animalStack.peek());
    }
}
