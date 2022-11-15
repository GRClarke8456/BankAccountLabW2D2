import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.math.RoundingMode;

public class BankingAccountTesting {
//    Property
    private BankAccountClass account;

//
    @BeforeEach
    public void setup(){
        account = new BankAccountClass("Georgia", "Clarke", "2001-04-05",
                54321, 398.51);
    }

//    Tests
    @Test
    public void testDeposit(){
//        Double actual = account.getBalance() + account.deposit(20.01);
//        Double expected = 418.52;
        assertThat(account.deposit(20.01)).isEqualTo(418.52);
    }

    @Test
    public void testWithdrawal(){
        Double actual = account.getBalance() - account.withdrawal(50.78);
        Double expected = 347.73;
        assertThat(account.withdrawal(actual)).isEqualTo(expected);

    }

    @Test
    public void testPayInterest(){
        assertThat(account.payInterest(1.15)).isEqualTo(458.28649999999993);
    }

}
