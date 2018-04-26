public class ProjectTest {
    public static void main(String[] args) {
        Project test1 = new Project();
        Project test2 = new Project();
        Project test3 = new Project("Project Test3", "Project Test3 Descripton");

        // Test 1
        test1.setName("Project Test1");
        System.out.println(test1.getName());

        System.out.println("\n");

        // Test 2
        test2.setName("Project Test2");
        test2.setDescription("Project Test2 Descripton");
        System.out.println(test2.elevatorPitch());

        System.out.println("\n");

        // Test 3
        System.out.println(test3.elevatorPitch());

    }
}

// Compile:
// javac ProjectTest.java
// java ProjectTest
// git push origin2 master