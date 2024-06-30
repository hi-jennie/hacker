package week6;

/**
 * @author rd_qinglin_mu
 * @description method overriding
 * @单据标识
 * @date 2024/6/30 22:53
 **/
public class JavaMethodOverriding {
    public static void main(String[] args) {
        Sports sports = new Sports();
        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();

        Soccer soccer = new Soccer();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }


    static class Sports {
        // if we didn't create a constructor, Java will create a default constructor for us
        String getName() {
            return "Generic Sports";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each team has n players in " + getName());
        }
    }

    static class Soccer extends Sports {

        @Override
        String getName() {
            return "Soccer Class";
        }

        @Override
        void getNumberOfTeamMembers() {
            System.out.println(("Each team has 11 players in " + getName()));
        }
    }
}
