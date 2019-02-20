package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Rank extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase("!rank")) {
            //Checks to make sure the user is not a bot
            if (!event.getMember().getUser().isBot()) {
                //Get the user, their current set role
                //Check to see if their wanted role sits lower or higher
                //Give role, remove old roll

                //At the end print this
                event.getChannel()
                        .sendMessage("Roll has been updated!")
                        .queue();


            }
        }

    }
}
