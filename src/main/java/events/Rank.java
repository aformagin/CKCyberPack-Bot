package events;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import static main.VarMap.*;

public class Rank extends ListenerAdapter {


    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        Guild guild = event.getGuild();
        if (guild == null) {
            //Print that it is not valid.
        } else {
            if (args[0].equalsIgnoreCase("!rank")) {

                //Checks to see if user input asks for newb
                if (args[1].equalsIgnoreCase("newb")) {
                    if (!event.getMember().getUser().isBot()) {
                        event.getGuild().getController().addRolesToMember(event.getMember(),
                                event.getJDA().getRolesByName("New Programmers", true))
                                .complete();

                        //At the end print this
                        event.getChannel()
                                .sendMessage("Role updated to: " + newb)
                                .queue();
                    }

                }

                //Checks to see if user input asks for moderate
                if (args[1].equalsIgnoreCase("moderate")) {
                    if (!event.getMember().getUser().isBot()) {
                        event.getGuild().getController().addRolesToMember(event.getMember(),
                                event.getJDA().getRolesByName("Moderate Programmers", true))
                                .complete();

                        //At the end print this
                        event.getChannel()
                                .sendMessage("Role updated to: " + modPrg)
                                .queue();
                    }
                }

                //Checks to see if the user input asks for wizard
                if (args[1].equalsIgnoreCase("wizard")) {
                    if (!event.getMember().getUser().isBot()) {
                        event.getGuild().getController().addRolesToMember(event.getMember(),
                                event.getJDA().getRolesByName("Programming Wizards", true))
                                .complete();

                        //At the end print this
                        event.getChannel()
                                .sendMessage("Role updated to: " + prgWizard)
                                .queue();
                    }
                }
            }
        }
    }
}