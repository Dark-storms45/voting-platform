package utility;

public class utilities {



    /**
     * Function to clear the terminal
     */
        public static void clear_Screen(){

            String os = System.getProperty("os.name").toLowerCase();

            try {
                if (os.contains("win")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                    new ProcessBuilder("/bin/bash", "-c", "clear").inheritIO().start().waitFor();
                }
            } catch (Exception e) {
                System.out.println("Something went wrong : " + e.getMessage());
            }
        }
    }

