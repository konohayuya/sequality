package sequality;

public class Calclulate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumRange(int a, int b) {
    int sum = 0;
    for (int i1 = a; i1 <= b; i1++)
      sum = this.sum(sum, i1);

    return sum;
  }

  public int sumRangeOdd(int a, int b) {
    int sum = 0;
    int i1 = a;

    if (!(i1 % 2 == 1))
      i1 += 1;

    for (; i1 <= b; i1 += 2)
      sum = this.sum(sum, i1);

    return sum;
  }

  public int sumRangeEven(int a, int b) {
    int sum = 0;
    int i1 = a;

    if (!(i1 % 2 == 0))
      i1 += 1;

    for (; i1 <= b; i1 += 2)
      sum = this.sum(sum, i1);

    return sum;
  }

  public float average(int sum, int count) {
    return (float) sum / count;
  }
}
