package week2.task2;
import week2.task1.Task1;
public class Fraction {

    // TODO: khai báo các thuộc tính
	private int numerator;
	private int denominator;
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
		if(denominator == 0){
			System.out.println("Error: Invalid Denominator!");
		}
		else{
			this.numerator = numerator;
			this.denominator = denominator;
		}
    }
	// Getter, Setter
	public int getNumerator(){
		return this.numerator;
	}
	public void setNumerator(int numerator){
		this.numerator = numerator;
	}
	public int getDenominator(){
		return this.denominator;
	}
	public void setDenominator(int denominator){
		this.denominator = denominator;
	}
	// Getter, Setter: END
	public String Output(){ // Hàm xuất phân số;
		String result = "";
		if( this.numerator == 0){
			result = "0";
		}
		else if(this.denominator == 1){
			result = String.valueOf(this.numerator);
		}
		else if(this.denominator == -1){
			this.numerator = this.numerator * (-1);
			result = String.valueOf(this.numerator);
		}
		else if(this.denominator == this.numerator){
			result = "1";
		}
		else if(this.denominator == -this.numerator){
			result = "-1";
		}
		else if(this.denominator < 0 && this.numerator > 0){
			this.numerator = this.numerator * (-1);
			this.denominator = this.denominator * (-1);
			result = String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator);
		}
		else{
			result = String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator);
		}
			return result;
	}
	public void minimal_fraction(){ // Hàm tối giản phân số
		int GCD = Task1.gcd(this.numerator, this.denominator);
		this.numerator = this.numerator / GCD;
		this.denominator = this.denominator / GCD;
	}
    public Fraction add(Fraction other) {
    
		Fraction Sum = new Fraction(1,1);
		Sum.numerator = (this.numerator*other.denominator) + (this.denominator*other.numerator);
		Sum.denominator = this.denominator * other.denominator;
		Sum.minimal_fraction();
        return Sum;
    }

    public Fraction subtract(Fraction other) {
        
		Fraction Subtract = new Fraction(1, 1);
		Subtract.numerator = (this.numerator*other.denominator) - (this.denominator*other.numerator);
		Subtract.denominator = this.denominator * other.denominator;
		Subtract.minimal_fraction();
        return Subtract;
    }

    public Fraction multiply(Fraction other) {
        
		Fraction Multiply = new Fraction(1,1);
		Multiply.numerator = this.numerator * other.numerator;
		Multiply.denominator = this.denominator * other.denominator;
		Multiply.minimal_fraction();
        return Multiply;
    }

    public Fraction divide(Fraction other) {
        
		Fraction Divide = new Fraction(1,1);
		Divide.numerator = this.numerator * other.denominator;
		Divide.denominator = this.denominator * other.numerator;
		Divide.minimal_fraction();
        return Divide;
    }
	public int equals(Fraction other){ // Hàm so sánh 2 phân số
		int Temp = (this.numerator*other.denominator) - (this.denominator*other.numerator);
		if( Temp == 0) return 0;
		if( Temp > 0) return 1;
		return -1;
	}

	public static void main(String args[])
	{
		Fraction This = new Fraction(1, 2);
		Fraction Other = new Fraction(5, 13);
		Fraction Add = This.add(Other);
		Fraction Sub = This.subtract(Other);
		Fraction Mul = This.multiply(Other);
		System.out.print("Add: ");
		System.out.println(Add.Output());
		System.out.print("Subtract: ");
		System.out.println(Sub.Output());
		System.out.print("Multiply: ");
		System.out.println(Mul.Output());
		// equals
		System.out.println("Equals Result:");
		int result = This.equals(Other);
		if(result == 0) System.out.println(" == ");
		else if(result == 1) System.out.println(" > ");
		else System.out.println(" < ");
	}
}
