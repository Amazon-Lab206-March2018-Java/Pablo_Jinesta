public class ProjectTest {
    public static void main(String[] args) {
        Project test1 = new Project();
        // Project test2 = new Project();

        test1.setName("Project Test1");
        test1.setDescription("Project Test1 Descripton");
        System.out.println(test1.elevatorPitch());
        System.out.println(test1.getName());
        System.out.println(test1.getDescription());
        // test2.setName("Project Test2", "Project Test2 Description");
    }
}

// Compile:
// javac ProjectTest.java
// java ProjectTest
// git push origin2 master