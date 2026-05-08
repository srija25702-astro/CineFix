import com.srija.cinefix.features.signin.SigninView;
import com.srija.cinefix.features.signup.SignupView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
      SigninView siv = new SigninView();
      SignupView suv = new SignupView();
      Scanner sc = new Scanner(System.in);
      System.out.println("Do yu have an account(y/n): ");
      String ans = sc.nextLine();
    String asIn = "";
    while(true){
        if(ans.equals("y")){
            asIn = siv.init();
            break;
        }
        else if(ans.equals("n")){
            suv.create();
            asIn = siv.init();
            break;
        }
    }


  }

