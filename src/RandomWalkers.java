public class RandomWalkers
{
    public static void main(String[] args)
    {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double averagesteps = 0;

        for (int n = 0; n < trials; n++)
        {
            int x = 0, y = 0, steps = 0, distance = 0;

            while (distance < r)
            {
                double i = Math.random();
                if (i < 0.25)
                {
                    x++;
                    distance = Math.abs(x) + Math.abs(y);
                    steps++;
                }
                if (i < 0.5)
                {
                    x--;
                    distance = Math.abs(x) + Math.abs(y);
                    steps++;
                }
                if (i < 0.75)
                {
                    y++;
                    distance = Math.abs(x) + Math.abs(y);
                    steps++;
                }
                if (i >= 0.75)
                {
                    y--;
                    distance = Math.abs(x) + Math.abs(y);
                    steps++;
                }
            }
            averagesteps += steps;
        }
        System.out.println("average number of steps = " + averagesteps/trials);
    }
}
