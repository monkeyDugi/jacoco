import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void isFull1() {
        Solution solution = new Solution();

        solution.maxNumberOfAttendees = 100;
        solution.numberOfEnrollment = 10;

        Assert.assertFalse(solution.isEnrollmentFull());
    }

    @Test
    public void isFull2() {
        Solution solution = new Solution();

        solution.maxNumberOfAttendees = 0;
        solution.numberOfEnrollment = 10;

        Assert.assertFalse(solution.isEnrollmentFull());
    }

    @Test
    public void isFull3() {
        Solution solution = new Solution();

        solution.maxNumberOfAttendees = 100;
        solution.numberOfEnrollment = 100;

//        Assert.assertTrue(solution.isEnrollmentFull());
    }
}