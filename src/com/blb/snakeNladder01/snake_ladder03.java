package com.blb.snakeNladder01;

public class snake_ladder03
{


        static int position = 0;
        public static final int SAME_POSITION = 0;
        public static final int LADDER = 1;
        public static final int SNAKE = 2;

        public static void main(String[] args)
        {
            System.out.println("Starting position of the player = " + position);
            int dice = (int) ((Math.random()*10)%7);
            int check = (int) ((Math.random()*10)%3);

            switch (check)
            {
                case SAME_POSITION:
                    System.out.println("Player stays on same position");
                    break;

                case LADDER:
                    position = position + dice;
                    System.out.println("Player got ladder and Position of the player = " +position);

                case SNAKE:
                    position = position - dice;
                    if ( position < 0 )
                    {
                        position = 0;
                        System.out.println("Player got snake and Position of the player = " +position);
                    }
            }
        }
    }

