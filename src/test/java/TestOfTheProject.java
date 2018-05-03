import org.junit.Test;

public class TestOfTheProject {

    AddedCreationOfaDanceFloor addedCreationOfaDanceFloor = new AddedCreationOfaDanceFloor();

    @Test
    public void positiveTest() {
        addedCreationOfaDanceFloor.createPlatform(2, 0, 7);
        addedCreationOfaDanceFloor.dancerMove();
    }

    @Test
    public void checkForNull() {
        addedCreationOfaDanceFloor.createPlatform();
        addedCreationOfaDanceFloor.dancerMove();
    }

    @Test
    public void createPlatform() {
        int arr[] = new int[60];
        for (int i = 0; i < 60; i++) {
            arr[i] = i;
        }
        addedCreationOfaDanceFloor.createPlatform(arr);
        addedCreationOfaDanceFloor.dancerMove();
    }
}
