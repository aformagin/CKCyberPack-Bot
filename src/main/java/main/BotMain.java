package main;

import events.Online;
import events.Rank;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;


public class BotMain {

    private static JDA jda;

    public static void main(String[] args) throws Exception {
        jda = new JDABuilder(AccountType.BOT)
                .setToken(VarMap.token).build();

        jda.addEventListener(new Online());
        jda.addEventListener(new Rank());

    }

}
