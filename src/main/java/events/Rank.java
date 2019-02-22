/*
 * RANK COMMAND, CALLED WITH: !rank
 *
 * FUNCTION NAME - DESCRIPTION|
 * add           - Adds the user to the requested role
 * del           - Removes the requested group from the user
 *
 */

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
            if (args[0].equalsIgnoreCase("!rank")) {//Checks for the command !rank


                /*
                 * This section checks to see if the user wants to add a role to their role list
                 */
                if (args[1].equalsIgnoreCase("add")) {//Checks for add param

                    //Checks to see if user input asks for newb
                    if (args[2].equalsIgnoreCase("newb")) {
                        if (!event.getMember().getUser().isBot()) {
                            event.getGuild().getController().addRolesToMember(event.getMember(),
                                    event.getJDA().getRolesByName(newb, true))
                                    .complete();
                        }

                    }

                    //Checks to see if user input asks for moderate
                    if (args[2].equalsIgnoreCase("moderate")) {
                        if (!event.getMember().getUser().isBot()) {
                            event.getGuild().getController().addRolesToMember(event.getMember(),
                                    event.getJDA().getRolesByName(modPrg, true))
                                    .complete();
                        }
                    }

                    //Checks to see if the user input asks for wizard
                    if (args[2].equalsIgnoreCase("wizard")) {
                        if (!event.getMember().getUser().isBot()) {
                            event.getGuild().getController().addRolesToMember(event.getMember(),
                                    event.getJDA().getRolesByName(prgWizard, true))
                                    .complete();
                        }
                    }

                    event.getChannel()
                            .sendMessage("Role Updated")
                            .queue();  //Sends the message ONLINE
                }
                /*
                 * This section checks to see if the user is looking to delete a role from their list
                 */
                else if (args[1].equalsIgnoreCase("del")) {
                    if (args[2].equalsIgnoreCase("newb")) {
                        if (!event.getMember().getUser().isBot()) {
                            event.getGuild().getController()
                                    .removeRolesFromMember(event.getMember(),
                                            event.getJDA().getRolesByName(newb, true)).complete();
                        }
                    }
                    if (args[2].equalsIgnoreCase("moderate")) {
                        if (!event.getMember().getUser().isBot()) {
                            event.getGuild().getController()
                                    .removeRolesFromMember(event.getMember(),
                                            event.getJDA().getRolesByName(modPrg, true)).complete();
                        }
                    }
                    if (args[2].equalsIgnoreCase("wizard")) {
                        if (!event.getMember().getUser().isBot()) {
                            event.getGuild().getController()
                                    .removeRolesFromMember(event.getMember(),
                                            event.getJDA().getRolesByName(prgWizard, true)).complete();
                        }
                    }
                    event.getChannel()
                            .sendMessage("Role Updated")
                            .queue();  //Sends the message ONLINE
                }

            }


        }
    }
}