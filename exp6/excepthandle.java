package exp6;
public class excepthandle {
    String emp_no, hr_pay;

    public excepthandle(String a, String b) {
        emp_no = a;
        hr_pay = b;
    }

    Boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    void emp_no_except() {
        try {
            if (isNumeric(emp_no)) {
                int a1 = Integer.valueOf(emp_no);
                if (a1 >= 1000) {
                    if (a1 <= 9999) {
                        System.out.println("valid employee no.");
                    } else {
                        throw new exp6.EmpException("employee id more than 9999");
                    }
                } else {
                    throw new exp6.EmpException("employee id less than 1000");
                }


            }
        }
            catch (exp6.EmpException e) {
            System.out.println(e);
        }
    }

    void Hr_pay_except() {
        try {
            if (isNumeric(hr_pay))
            {
                int b1 = Integer.valueOf(hr_pay);
                if (b1 >= 9) {
                    if (b1 <= 25) {
                        System.out.println("valid hour pay");
                    } else {
                        throw new exp6.EmpException("hour pay is greater than 25");
                    }
                } else {
                    throw new exp6.EmpException("hour pay less than 9");
                }
            }
            else {
                throw new exp6.EmpException("hour pay number format exception");

            }
        }
        catch(exp6.EmpException e)
            {
                System.out.println(e);
            }
        }


}

    class EmpException extends Exception
    {
        EmpException(String msg)
        {
            super(msg);
        }
    }
