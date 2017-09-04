package jonaslamb.android.workinit;
/*
*Let’s talk about the functionality.

The functionality the application will support:

Allow the user to enter a new customer
Display a list of customers and their picture
Allow the user to take a picture of a customer
Allow the user to view customer sessions
Allow the user to mark a customer session as completed
Allow the user to enter new customer sessions
Allow a customer to sign the screen for a completed session
Allow the user to submit customer billing information.
    I.E Credit Card Information.
Allow the user to submit payment for customer when signing up for new sessions.
Generate a receipt for the customer after payment success and allow the receipt to
be sent to a printer if available or allow the user to send it via email.


Design the UI screens for your application to support the above functionality. You
can use a tool for your mockups or you can just draw them and scan the images.
Make sure that the controls you add on your mockups are actual controls that are
available to you in the android controls. Try to avoid getting overly complex with
your screens, as we will be actually implementing these as layouts next week.
*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Directory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory);
    }
}
