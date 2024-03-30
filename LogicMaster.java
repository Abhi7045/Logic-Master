import java.util.Scanner;

public class LogicMaster {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean logic_features = true;
        do {
            System.out.println("\t*********Welcome to logic Master*************");
            System.out.println("1.Number Program\n2.Pattern Program\n3.Swiggy\n4.Guessing Number Game\n5.Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    boolean num_features = true;
                    System.out.println("*******Welcome to Number Program************");
                    System.out.println(
                            "1.Factorial Number\n2.Prime Number\n3.Strong Number\n4.Palindrome Number\n5.Perfect Number\n6.Binary");
                    int numOption;
                    do {
                        numOption = sc.nextInt();
                        switch (numOption) {
                            case 1: {
                                // Factorial
                                System.out.println("Enter the number:");
                                int num = sc.nextInt();
                                int factorial = 1;
                                for (int i = 1; i <= num; i++) {
                                    factorial *= i;
                                }
                                System.out.println("Factorial of " + num + " is: " + factorial);
                                break;
                            }
                            case 2: {
                                // Prime Number
                                System.out.println("Enter the number:");
                                int num = sc.nextInt();
                                if (num == 0 || num == 1) {
                                    System.out.println("Neither prime NOR Composite");
                                }
                                boolean isPrime = true;
                                for (int i = 2; i < num; i++) {
                                    if (num % i == 0) {
                                        System.out.println("Composite");
                                        isPrime = false;
                                        break;
                                    }
                                }
                                if (isPrime) {
                                    System.out.println("Prime");
                                }
                                break;
                            }
                            case 3: {
                                // Srtong Sum
                                System.out.println("Enter the number:");
                                int num = sc.nextInt();
                                int sum = 0, fact = 1, temp = 0;
                                while (num > 0) {
                                    for (int i = num % 10; i >= 2; i--) {
                                        fact = fact * i;
                                    }
                                    sum = sum + fact;
                                    fact = 1;
                                    num = num / 10;
                                }
                                if (num == temp) {
                                    System.out.println("Number is Strong:" + sum);
                                }
                                break;
                            }
                            case 4: {
                                // palindrome
                                break;
                            }
                            case 5: {
                                // perfect sum
                                System.out.println("Enter the number:");
                                int num = sc.nextInt();
                                int sum = 0;
                                for (int i = 1; i < num; i++) {
                                    if (num % i == 0) {
                                        sum += i;
                                    }
                                }
                                if (num == sum) {
                                    System.out.println("Perfect Number");
                                } else {
                                    System.out.println("Not Perfect");
                                }
                                break;
                            }
                            case 6: {
                                // binary number
                                System.out.println("Enter the Binary Number:");
                                int binary = sc.nextInt();
                                int sum = 0, pow = 1;
                                while (binary > 0) {
                                    sum += binary % 2 * pow;
                                    pow *= 2;
                                    binary /= 10;
                                }
                                System.out.println("Number:" + sum);
                                break;
                            }
                            default: {
                                num_features = false;
                                break;
                            }
                        }
                    } while (num_features);
                    break;
                }
                case 2: {
                    boolean p_features = true;
                    System.out.println("*******Welcome to Pattern Program************");
                    System.out.println(
                            "1.Hallow Square\n2.Right half Pyramid\n3.Full Pyramid\n4.Butterfuly\n5.Floyid's Triangle");

                    do {
                        int P_Option = sc.nextInt();
                        switch (P_Option) {
                            case 1: {// Hollow Square
                                int n = 5;
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < n; j++) {
                                        if (i == 0 || i == n - 1 || j == n - 1 || j == 0) {
                                            System.err.print("* ");
                                        } else {
                                            System.out.print("  ");
                                        }
                                    }
                                    System.out.println();
                                }

                                break;
                            }
                            case 2: {
                                // Right half Pyramid
                                int n = 5;
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < n; j++) {

                                        if (i >= j) {
                                            System.err.print("* ");
                                        } else {
                                            System.out.print("  ");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            }
                            case 3: {// Full Pyramid
                                int n = 5;
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < n; j++) {

                                        if (i + j >= n - 1) {

                                            System.err.print("*   ");
                                        } else {
                                            System.out.print("  ");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;

                            }
                            case 4: {// Butterfly
                                int n = 5;
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < n; j++) {

                                        if (j <= i && i + j <= n - 1 || j >= i && i + j >= n - 1) {

                                            System.err.print("* ");
                                        } else {
                                            System.out.print("  ");
                                        }
                                    }
                                    System.out.println();

                                }
                                break;

                            }
                            case 5: {
                                // Fylod triangle
                                int n = 5;
                                int k = 1;
                                for (int i = 0; i < n; i++) {
                                    for (int j = 0; j < n; j++) {

                                        if (i >= j) {

                                            System.err.print(k++ + " ");
                                        } else {
                                            System.out.print("  ");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            }
                            default:
                                p_features = false;
                                break;
                        }
                    } while (p_features);
                    break;
                }
                case 3: {
                    // swiggy
                    System.out.println("!!**Select the Hotel**!!");
                    System.out.println("1.Local Adda\n2.Little India\n3.Belly box");
                    int hotel = sc.nextInt();
                    switch (hotel) {
                        case 1: {
                            System.out.println("\t\t**Welcome to Local Adda**");
                            System.out.println("\t\tSelect your favourite food");
                            System.out.println("1.litti chokha\n2.paneer thika\n3.khadhai paneer");
                            int food = sc.nextInt();
                            System.out.println("\t\tProcessing.........");
                            Thread.sleep(2000);
                            switch (food) {
                                case 1: {
                                    double price = 60;
                                    System.out.println("\t\tEnter the quantity:");
                                    int qyt = sc.nextInt();
                                    System.out.println("\t\tProcessing....");
                                    Thread.sleep(2000);
                                    double bill = qyt * price;
                                    System.out.println("\t\tTotal Payement:" + bill);
                                    System.out.println("Select Payment mode:");
                                    System.out.println("1.GPay\n2.PhonePay\n3.AmazonePay");
                                    int p_mode = sc.nextInt();
                                    System.out.println("\t\tProcessing.....");
                                    switch (p_mode) {
                                        case 1: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 2: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 3: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                    }

                                }
                                case 2: {
                                    double price = 120;
                                    System.out.println("\t\tEnter the quantity:");
                                    int qyt = sc.nextInt();
                                    System.out.println("\t\tProcessing....");
                                    Thread.sleep(2000);
                                    double bill = qyt * price;
                                    System.out.println("\t\tTotal Payement:" + bill);
                                    System.out.println("Select Payment mode:");
                                    System.out.println("1.GPay\n2.PhonePay\n3.AmazonePay");
                                    int p_mode = sc.nextInt();
                                    System.out.println("\t\tProcessing.....");
                                    switch (p_mode) {
                                        case 1: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 2: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 3: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                    }

                                }
                                case 3: {
                                    double price = 105;
                                    System.out.println("\t\tEnter the quantity:");
                                    int qyt = sc.nextInt();
                                    System.out.println("\t\tProcessing....");
                                    Thread.sleep(2000);
                                    double bill = qyt * price;
                                    System.out.println("\t\tTotal Payement:" + bill);
                                    System.out.println("Select Payment mode:");
                                    System.out.println("1.GPay\n2.PhonePay\n3.AmazonePay");
                                    int p_mode = sc.nextInt();
                                    System.out.println("\t\tProcessing.....");
                                    switch (p_mode) {
                                        case 1: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 2: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 3: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                    }

                                }
                            }
                        }
                        case 2: {
                            System.out.println("\t\t**Welcome to Little India**");
                            System.out.println("\t\tSelect your favourite food");
                            System.out.println("1.Mashroom Gravy\n2.Chicken Thika\n3.Palak paneer");
                            int food = sc.nextInt();
                            System.out.println("\t\tProcessing.........");
                            Thread.sleep(2000);
                            switch (food) {
                                case 1: {
                                    double price = 90;
                                    System.out.println("\t\tEnter the quantity:");
                                    int qyt = sc.nextInt();
                                    System.out.println("\t\tProcessing....");
                                    Thread.sleep(2000);
                                    double bill = qyt * price;
                                    System.out.println("\t\tTotal Payement:" + bill);
                                    System.out.println("Select Payment mode:");
                                    System.out.println("1.GPay\n2.PhonePay\n3.AmazonePay");
                                    int p_mode = sc.nextInt();
                                    System.out.println("\t\tProcessing.....");
                                    switch (p_mode) {
                                        case 1: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 2: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 3: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                    }

                                }
                                case 2: {
                                    double price = 130;
                                    System.out.println("\t\tEnter the quantity:");
                                    int qyt = sc.nextInt();
                                    System.out.println("\t\tProcessing....");
                                    Thread.sleep(2000);
                                    double bill = qyt * price;
                                    System.out.println("\t\tTotal Payement:" + bill);
                                    System.out.println("Select Payment mode:");
                                    System.out.println("1.GPay\n2.PhonePay\n3.AmazonePay");
                                    int p_mode = sc.nextInt();
                                    System.out.println("\t\tProcessing.....");
                                    switch (p_mode) {
                                        case 1: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 2: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 3: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                    }

                                }
                                case 3: {
                                    double price = 125;
                                    System.out.println("\t\tEnter the quantity:");
                                    int qyt = sc.nextInt();
                                    System.out.println("\t\tProcessing....");
                                    Thread.sleep(2000);
                                    double bill = qyt * price;
                                    System.out.println("\t\tTotal Payement:" + bill);
                                    System.out.println("Select Payment mode:");
                                    System.out.println("1.GPay\n2.PhonePay\n3.AmazonePay");
                                    int p_mode = sc.nextInt();
                                    System.out.println("\t\tProcessing.....");
                                    switch (p_mode) {
                                        case 1: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 2: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 3: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                    }

                                }
                            }
                        }
                        case 3: {
                            System.out.println("\t\t**Welcome to Belly Box**");
                            System.out.println("\t\tSelect your favourite food");
                            System.out.println("1.Butter Nan\n2.Paneer Butter Mashala\n3.Fried Rice");
                            int food = sc.nextInt();
                            System.out.println("\t\tProcessing.........");
                            Thread.sleep(2000);
                            switch (food) {
                                case 1: {
                                    double price = 30;
                                    System.out.println("\t\tEnter the quantity:");
                                    int qyt = sc.nextInt();
                                    System.out.println("\t\tProcessing....");
                                    Thread.sleep(2000);
                                    double bill = qyt * price;
                                    System.out.println("\t\tTotal Payement:" + bill);
                                    System.out.println("Select Payment mode:");
                                    System.out.println("1.GPay\n2.PhonePay\n3.AmazonePay");
                                    int p_mode = sc.nextInt();
                                    System.out.println("\t\tProcessing.....");
                                    switch (p_mode) {
                                        case 1: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 2: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 3: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                    }

                                }
                                case 2: {
                                    double price = 135;
                                    System.out.println("\t\tEnter the quantity:");
                                    int qyt = sc.nextInt();
                                    System.out.println("\t\tProcessing....");
                                    Thread.sleep(2000);
                                    double bill = qyt * price;
                                    System.out.println("\t\tTotal Payement:" + bill);
                                    System.out.println("Select Payment mode:");
                                    System.out.println("1.GPay\n2.PhonePay\n3.AmazonePay");
                                    int p_mode = sc.nextInt();
                                    System.out.println("\t\tProcessing.....");
                                    switch (p_mode) {
                                        case 1: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 2: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 3: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                    }

                                }
                                case 3: {
                                    double price = 90;
                                    System.out.println("\t\tEnter the quantity:");
                                    int qyt = sc.nextInt();
                                    System.out.println("\t\tProcessing....");
                                    Thread.sleep(2000);
                                    double bill = qyt * price;
                                    System.out.println("\t\tTotal Payement:" + bill);
                                    System.out.println("Select Payment mode:");
                                    System.out.println("1.GPay\n2.PhonePay\n3.AmazonePay");
                                    int p_mode = sc.nextInt();
                                    System.out.println("\t\tProcessing.....");
                                    switch (p_mode) {
                                        case 1: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 2: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                        case 3: {
                                            System.out.println("\t\tEnter Bill Amount:" + bill);
                                            double user_enter_bill_amount = sc.nextInt();
                                            if (user_enter_bill_amount == bill) {
                                                System.out.println("\t\tEnter the OTP");
                                                int sys_otp = (int) (Math.random() * 9999 + 9999);
                                                Thread.sleep(2000);
                                                System.out.println(sys_otp);
                                                int user_otp = sc.nextInt();
                                                if (sys_otp == user_otp) {
                                                    System.out.println("\t\tPayment Succesfull");
                                                    System.out.println(
                                                            "\t\t**Thank you***\nYour Order will Deliver soon");
                                                } else {
                                                    System.out.println("\t\tPayment Fail....");
                                                }

                                            } else {
                                                System.out.println("Payment Fail...");
                                            }
                                        }
                                    }

                                }
                            }
                        }

                    }

                }
                case 4: {
                    // Guessing number game
                    int number = (int) (Math.random() * 80);
                    boolean repeat_features = true;
                    System.out.println("\n\t\t!!**Guessing Number **!!\n\n");

                    System.out.println("\t** Assumed a Number from 1-80 **\n\n");
                    Thread.sleep(2000);

                    System.out.println("\t\t Start Your Guess.......\n\n");
                    do {
                        System.out.println("Enter the number:");
                        Thread.sleep(2000);
                        int n = sc.nextInt();
                        if (n > number) {
                            System.out.println("High");
                        } else if (n < number) {
                            System.out.println("Low");
                        } else if (n == number) {
                            System.out.println("\t\t!** WOW..You Get It **!");
                            System.out.println("1.Play Again\n2.Exit");
                            int input = sc.nextInt();
                            if (input == 2) {
                                repeat_features = false;

                            }
                            number = (int) (Math.random() * 80);
                        }
                    } while (repeat_features);
                    System.out.println("\t\t\t!!**********Thank You************!!");
                }
                default: {
                    logic_features = false;
                    break;
                }
            }
        } while (logic_features);
        System.out.println("!!********Thank You for Using logic Master**********!!");
    }
}
