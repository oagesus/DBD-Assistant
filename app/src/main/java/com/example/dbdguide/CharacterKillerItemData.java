package com.example.dbdguide;

import java.util.Arrays;
import java.util.List;

import android.content.Context;

public class CharacterKillerItemData {



    // Static method to return a list of ButtonItems
    public static List<CharacterItem> getButtonItems(Context context) {

        String movementSpeed = Utils.drawableToBase64(context, R.drawable.icon_killer_movement_speed);
        String terrorRadius = Utils.drawableToBase64(context, R.drawable.icon_killer_terror_radius);
        String height = Utils.drawableToBase64(context, R.drawable.icon_killer_height);

        return Arrays.asList(
                new CharacterItem("<font color='#ffffff'><b>TRAPPER</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>BEAR TRAP - POWER</b></font><br>" +
                                "A large foothold trap made of steel. Traps are found lying around the area waiting to be picked up and set anywhere.<br><br>" +
                                "<font color='#ffffff'><b>BEAR TRAP</b></font><br>" +
                                "By default, you start the trial with <b>2 Bear Traps</b>. Find and collect more throughout the environment.<br><br>" +
                                "<font color='#ffffff'><b>Set Bear Trap:</b></font><br>" +
                                "Press and hold the <i>Power button</i> to set a <b>Bear Trap</b> on a valid location in front of you. A set <b>Bear Trap</b> will immobilize and incapacitate any player that steps on it. A healthy Survivor that steps in a set <b>Bear Trap</b> will also become injured but may attempt to escape the trap. " +
                                "Press the <i>Interaction button</i> to pick-up a nearby Survivor who is Incapacitated by a <b>Bear Trap</b>.<br><br>" +
                                "<b><font color='#ffffff'>Reset Trap:</b></font><br>" +
                                "Press and hold the <i>Power button</i> while standing near a <b>Bear Trap</b> in the environment to reset it where it lies, if it is not already set.<br><br>" +
                                "<b><font color='#ffffff'>Collect Bear Trap:</b></font><br>" +
                                "Press the <i>Interaction button</i> while standing near a <b>Bear Trap</b> in the environment to collect it. By default, you may carry a maximum of <b>2 Bear Traps</b> at any time.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_trapper, 1, Arrays.asList(R.drawable.killer_agitation, R.drawable.killer_brutal_strength, R.drawable.killer_unnerving_presence)),
                new CharacterItem("<font color='#ffffff'><b>WRAITH</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>WAILING BELL - POWER</b></font><br>" +
                                "A heavy cast iron bell imbued with ancient powers. Allows its user to enter and walk the spirit world when rung.<br><br>" +
                                "<font color='#ffffff'><b>WAILING BELL</b></font><br>" +
                                "Press and hold the <i>Power button</i> to <b>Cloak</b>. Press and hold the <i>Power button</i> again while Cloaked to <b>Uncloak</b>, granting a <b>1 second</b> burst of speed upon reappearing. The Wailing Bell can be heard up to a distance of <b>24 meters</b>.<br><br>" +
                                "<font color='#ffffff'><b>Cloak:</b></font><br>" +
                                "While Cloaked, <b>The Wraith</b> is granted increased movement speed, near total invisibility, and the <b>Undetectable</b> status effect. <b>The Wraith</b> may not attack while Cloaked, but can interact with environmental objects.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_wraith, 2, Arrays.asList(R.drawable.killer_bloodhound, R.drawable.killer_predator, R.drawable.killer_shadowborn)),
                new CharacterItem("<font color='#ffffff'><b>HILLBILLY</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>CHAINSAW - POWER</b></font><br>" +
                                "The machine gave him a new life, one where the power was in his hands.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>CHAINSAW</b></font><br>" +
                                "Press and hold the <i>Power button</i> to break into a <b>Chainsaw Sprint</b>. Survivors hit during a <b>Chainsaw Sprint</b> are put into the dying state.<br><br>" +
                                "Revving the chainsaw, and sprinting each cause the <b>Overdrive meter</b> to increase. The meter decreases when the chainsaw is not in use.<br><br>" +
                                "When the meter is full, the chainsaw goes into <b>Overdrive</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL STATE: OVERDRIVE</b></font><br>" +
                                "While in <b>Overdrive</b>, the chainsaw is enhanced. Chainsaw Charge and Sprint speeds are increased, and <b>Chainsaw Sprint</b> cooldowns are reduced.<br><br>" +
                                "<b>Overdrive</b> lasts for <b>20 seconds</b>.",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_hillbilly, 3, Arrays.asList(R.drawable.killer_enduring, R.drawable.killer_lightborn, R.drawable.killer_tinkerer)),
                new CharacterItem("<font color='#ffffff'><b>NURSE</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>SPENCER'S LAST BREATH - POWER</b></font><br>" +
                                "A powerful and violent last breath snatched from Crotus Prenn Asylum warden Patrick Spencer. Channelling its energy allows The Nurse to pierce and jump through the spirit world in a Blink multiple times in a row. Doing so leaves her in a state of fatigue." +
                                "<ul><li>Grants the Blink.</li><br>" +
                                "<li>Grants <b>1</b> additional Chain Blink.</li><br>" +
                                "<li>Attacks made after a Blink but before the ensuing fatigue are special attacks.</li><br>" +
                                "<li>After a Blink but before the ensuing fatigue, The Nurse can interrupt and grab Survivors.</li></ul></font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;3.85m/s&nbsp;(96.25%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_nurse, 4, Arrays.asList(R.drawable.killer_a_nurses_calling, R.drawable.killer_stridor, R.drawable.killer_thanatophobia)),
                new CharacterItem("<font color='#ffffff'><b>SHAPE</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>EVIL WITHIN - POWER</b></font><br>" +
                                "The darkness inside feeds his determination to take the life of his prey.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>EVIL WITHIN</b></font><br>" +
                                "Activating <b>Evil Within</b> allows <b>The Shape</b> to see his prey clearly and build up more evil power by Stalking them.<br><br>" +
                                "<font color='#ffffff'><b>Evil Within I:</b></font><br>" +
                                "Grants <b>Undetectable</b> status effect. Slightly decreased movement speed. <i>Basic attack</i> has a slightly decreased lunge.<br><br>" +
                                "<font color='#ffffff'><b>Evil Within II:</b></font><br>" +
                                "Moderately decreased Terror Radius. Slightly increased movement speed. <i>Basic attack</i> has a slightly increased lunge.<br><br>" +
                                "<font color='#ffffff'><b>Evil Within III:</b></font><br>" +
                                "When triggered, all Survivors suffer from the <b>Exposed</b> status effect. <b>Evil Within III</b> lasts for <b>60 seconds</b>, after which, it regresses to <b>Evil Within II</b>.<br><br>" +
                                "<font color='#ffffff'><b>SPECIAL ABILITY: STALK</b></font><br>" +
                                "Press and hold the <i>Power button</i> to Stalk all visible Survivors. Stalking Survivors builds up your progress through <b>Evil Within</b> tiers.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_shape, 5, Arrays.asList(R.drawable.killer_dying_light, R.drawable.killer_play_with_your_food, R.drawable.killer_save_the_best_for_last)),
                new CharacterItem("<font color='#ffffff'><b>HAG</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>BLACKENED CATALYST - POWER</b></font><br>" +
                                "The source of The Hag's power, a blackened finger used as a catalyst for her terrible power. The Hag bends and shapes mud to her will. With simple ritualistic drawings, she creates deceitful duplicates of herself made from mud and decay which she can use for various effects." +
                                "<ul><li>Grants the ability to create and maintain <b>10</b> Phantasm Traps.</li><br>" +
                                "<li>Grants the ability to instantly travel to triggered Phantasm Traps when within a <b>48 meter</b> range.</li></ul></font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.4m/s&nbsp;(110%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;24m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_hag, 6, Arrays.asList(R.drawable.killer_hex_devour_hope, R.drawable.killer_hex_ruin, R.drawable.killer_hex_the_third_seal)),
                new CharacterItem("<font color='#ffffff'><b>DOCTOR</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>CARTER'S SPARK - POWER</b></font><br>" +
                                "Successfully striking Survivors with <b>The Doctor</b>'s special abilities, <b>Shock Therapy</b> or <b>Static Blast</b>, increases the Survivor's <i>Madness</i>, eventually afflicting them with the <b>Madness</b> status effect and triggering increasingly potent effects.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Madness I:</b></font><br>" +
                                "Causes Survivors to scream once, revealing their position to <b>The Doctor</b>. <b>Slightly</b> affects Skill Check placement and direction.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Madness II:</b></font><br>" +
                                "Causes Survivors to scream once and experience hallucinations in the form of an <i>illusionary Doctor</i>. <b>Moderately</b> affects Skill Check placement and direction.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Madness III:</b></font><br>" +
                                "Causes Survivors to scream intermittently and experience hallucinations in the form of an <i>illusionary Doctor</i>. <b>Tremendously</b> affects Skill Check placement and direction. The Survivor cannot heal, repair, sabotage, unlock, cleanse, or use items until they successfully <i>Snap Out Of It</i>. When a Survivor completes the <i>Snap Out Of It</i> action, they return to <b>Madness I</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: SHOCK THERAPY</b></font><br>" +
                                "Press and hold the <i>Power button</i> to perform <b>Shock Therapy</b>, unleashing a ranged shock attack on the ground in front of you. Survivors struck by <b>Shock Therapy</b> gain increased <i>Madness</i> and any interactions they are performing are immediately interrupted. <b>Shock Therapy</b> immediately negates the <b>Oblivious</b> status effect.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: STATIC BLAST</b></font><br>" +
                                "Press and hold the <i>Active Ability button</i> to perform a <b>Static Blast</b>, causing all Survivors within The Doctor's Terror Radius to scream and gain increased <i>Madness</i>. <b>Static Blast</b> can only be activated when not on cooldown. <b>Static Blast</b> immediately negates the <b>Oblivious</b> status effect.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_doctor, 7, Arrays.asList(R.drawable.killer_monitor_and_abuse, R.drawable.killer_overcharge, R.drawable.killer_overwhelming_presence)),
                new CharacterItem("<font color='#ffffff'><b>HUNTRESS</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>HUNTING HATCHETS - POWER</b></font><br>" +
                                "A skill taught by her mother and mastered in the wild. The Huntress can hurl Hatchets with deadly precision." +
                                "<ul><li>Start the trial with <b>7 Hatchets</b>.</li><br>" +
                                "<li>Charge throw for maximum throwing speed.</li><br>" +
                                "<li>Refill Hatchets at <b>Lockers</b>.</li></ul></font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.4m/s&nbsp;(110%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;20m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_huntress, 8, Arrays.asList(R.drawable.killer_beast_of_prey, R.drawable.killer_hex_huntress_lullaby, R.drawable.killer_territorial_imperative)),
                new CharacterItem("<font color='#ffffff'><b>CANNIBAL</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>BUBBA'S CHAINSAW - POWER</b></font><br>" +
                                "The Cannibal starts the trial with <b>3</b> charges. Press and hold the <i>Power button</i> to consume one charge and perform a <b>Chainsaw Sweep</b> attack that can hit multiple targets. Survivors hit during a <b>Chainsaw Sweep</b> are put into the dying state." +
                                "<ul><li>Use a charge to extend the length of the <b>Chainsaw Sweep</b>. Doing this incurs a slightly longer cooldown.</li><br>" +
                                "<li>Chainsaw charges replenish when the chainsaw is not in use.</li></ul>" +
                                "The <b>Tantrum Meter</b> slowly fills when revving the Chainsaw. Once the meter is full, or after hitting an object during a <b>Chainsaw Sweep</b>, The Cannibal unleashes a <b>Tantrum</b>. The <b>Tantrum</b> damages any Survivor’s around him and puts them into the dying state." +
                                "<ul><li>The <b>Tantrum</b> duration increases for each charge that had been used during the <b>Chainsaw Sweep</b>. Any remaining charges are lost.</li><br>" +
                                "<li>During a <b>Tantrum</b>, movement speed is decreased.</li><br>" +
                                "The <b>Tantrum Meter</b> decreases when the Chainsaw is not in use and completely depletes during a <b>Chainsaw Sweep</b>.</li></ul></font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_cannibal, 9, Arrays.asList(R.drawable.killer_barbecue_and_chili, R.drawable.killer_franklins_demise, R.drawable.killer_knock_out)),
                new CharacterItem("<font color='#ffffff'><b>CANNIBAL</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>DREAM DEMON - POWER</b></font><br>" +
                                "All Survivors have a Sleep Meter that fills over time; once filled, Survivors fall asleep and enter the Dream World, where they are afflicted with the <b>Oblivious</b> status effect. Hitting an awake Survivor with a <i>basic attack</i> will also send them to the Dream World. Survivors can wake by failing Skill Checks, having an awake Survivor perform the <i>Wake Up action</i>, or using alarm clocks that also provide temporary immunity to sleep.<br><br>" +
                                "Awake Survivors hear <b>The Nightmare</b>'s Terror Radius and see him within 16 meters, intermittently see him from 16 to 32 meters, and cannot see him beyond that.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: DREAM SNARES AND DREAM PALLETS</b></font><br>" +
                                "While selected, press the <i>Power button</i> to charge a <b>Dream Snare</b>, and press the <i>Attack button</i> to release it. <b>Dream Snares</b> move quickly in a straight line, through walls but not over ledges. Survivors hit by the <b>Dream Snare</b> add time to their Sleep Meter if they are awake, while Sleeping Survivors will be <b>Hindered</b>.<br><br>" +
                                "While selected, press the <i>Power button</i> to summon a <b>Dream Pallet</b> at a valid pallet location. Press the <i>Power button</i> while targeting a <b>Dream Pallet</b> to rupture it. Survivors hit by the rupture add time to their Sleep Meter if awake, while sleeping Survivors will be injured.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: DREAM PROJECTION</b></font><br>" +
                                "Hold the <i>Ability button</i> to teleport to a generator or Survivor performing a healing action in the Dream World. Upon teleporting, all nearby Survivors add time to their Sleep Meter and are temporarily revealed with Killer Instinct. For each Survivor in the Dream World, the cooldown is reduced by <b>15%</b>.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_nightmare, 10, Arrays.asList(R.drawable.killer_blood_warden, R.drawable.killer_fire_up, R.drawable.killer_remember_me)),
                new CharacterItem("<font color='#ffffff'><b>CANNIBAL</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>JIGSAW'S BAPTISM - POWER</b></font><br>" +
                                "Forever devoted to her master's cause, she punishes the ungrateful and the guilty with slyness and murderous puzzles. <b>The Pig</b> can move stealthily, dash in Ambush attacks and put deadly Reverse Bear Traps on Survivors' heads.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>JIGSAW'S BAPTISM</b></font><br>" +
                                "Start the trial with <b>4</b> <i>inactive</i> Reverse Bear Traps. While standing over a Survivor in the dying state, press the <i>Active Ability button</i> to place an <i>inactive</i> Reverse Bear Trap on The Survivor. Reverse Bear Traps become <i>active</i> when any generator in the trial is completed. Survivors may attempt to free themselves from <i>active</i> or <i>inactive</i> Reverse Bear Traps by searching Jigsaw Boxes located in the environment to find the correct key.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Active Reverse Bear Trap:</b></font><br>" +
                                "When Reverse Bear Traps become <i>active</i>, they initiate a countdown timer. A Survivor with an active Reverse Bear Trap is automatically sacrificed when their timer expires or if they attempt to leave the trial with an <i>active</i> Reverse Bear Trap still attached.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: CROUCH</b></font><br>" +
                                "Press the <i>Active Ability button</i> to Crouch. Press the <i>Active Ability button</i> again while Crouched to stand. <b>The Pig</b> moves at a slower speed while Crouched. <b>The Pig</b> is granted the <b>Undetectable</b> status effect while Crouched.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: AMBUSH</b></font><br>" +
                                "Press and hold the <i>Attack button</i> while Crouched to dash and perform an <b>Ambush</b> attack.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_pig, 11, Arrays.asList(R.drawable.killer_make_your_choice, R.drawable.killer_scourge_hook_hangmans_trick, R.drawable.killer_surveillance)),
                new CharacterItem("<font color='#ffffff'><b>CLOWN</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>THE AFTERPIECE TONIC - POWER</b></font><br>" +
                                "Throughout his years experimenting with anesthetics and muscle relaxants, The Clown developed several effective concoctions and formulas. He has used his favorite, The Afterpiece Tonic, to great effect, intoxicating and capturing many unwilling victims. The associated Afterpiece Antidote also has useful effects.<br><br>" +
                                "Tap the <i>Active Ability button</i> to switch between the <b>Afterpiece Tonic</b> and the <b>Afterpiece Antidote</b>. Tap or hold and release the <i>Power button</i> to launch a bottle.<br><br>" +
                                "Press and hold the <i>Active Ability button</i> to replenish your bottles.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: AFTERPIECE TONIC</b></font><br>" +
                                "On contact, the bottle will break, releasing a purple gas cloud that <b>intoxicates</b> Survivors. <b>Intoxicated</b> Survivors will suffer from impaired vision, reduced movement speed, and involuntary coughing for 2 seconds.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: AFTERPIECE ANTIDOTE</b></font><br>" +
                                "On contact, the bottle will break, releasing a gray gas cloud which turns yellow upon activation. The Clown and any Survivors who enter an active <b>Antidote cloud</b> gain a 10% movement speed bonus for 6 seconds. <b>Intoxicated</b> Survivors who enter an <b>Antidote cloud</b> are cured.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_clown, 12, Arrays.asList(R.drawable.killer_bamboozle, R.drawable.killer_coulrophobia, R.drawable.killer_pop_goes_the_weasel)),
                new CharacterItem("<font color='#ffffff'><b>SPIRIT</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>YAMAOKA'S HAUNTING - POWER</b></font><br>" +
                                "The Spirit can use her power, Yamaoka’s Haunting, to enter an ethereal plane and reappear at a new location." +
                                "<ul><li>Tap and Hold the <i>Power button</i> to charge. The Spirit will depart her physical body, leaving behind a stationary 'husk'.</li></ul>" +
                                "While Yamaoka’s Haunting is active:" +
                                "<ul><li>The Spirit may traverse freely to a new location, moving at a faster rate for a short duration. She is still confined to movement within the physical environments and surroundings.</li><br>" +
                                "<li>The Spirit leaves the physical plane, losing sight of all Survivors. She can, however, still sense the scratch marks they leave in the environment.</li><br>" +
                                "<li>The Spirit will produce an audible cue at her current location.</li><br>" +
                                "<li>Once the power has ended, The Spirit retains her speed boost for a brief period and her husk fades away.</li></ul>" +
                                "Using Yamaoka’s Haunting depletes The Spirit's power bar. The power bar will automatically replenish over time. The power bar must be fully replenished before it can be triggered again.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.4m/s&nbsp;(110%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;24m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_spirit, 13, Arrays.asList(R.drawable.killer_hex_haunted_ground, R.drawable.killer_rancor, R.drawable.killer_spirit_fury)),
                new CharacterItem("<font color='#ffffff'><b>LEGION</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>FERAL FRENZY - POWER</b></font><br>" +
                                "They were a plain group of friends until Frank formed them into a Legion. Now they draw power from the thrilling freedom of not abiding by any rule but their own.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>FERAL FRENZY</b></font><br>" +
                                "Trigger <b>Feral Frenzy</b> to run at a high speed and chain attacks between multiple Survivors. When your power gauge is full, press the <i>Power button</i> to initiate <b>Feral Frenzy</b>. While <b>Feral Frenzy</b> is active, <b>The Legion</b> moves faster and gains access to additional abilities: <b>Pallet Vault</b> and <b>Feral Slash</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: PALLET VAULT</b></font><br>" +
                                "Press the <i>Interaction button</i> while <b>Feral Frenzy</b> is active, to perform a <b>Pallet Vault</b> at a dropped pallet.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: FERAL SLASH</b></font><br>" +
                                "Press the <i>Attack button</i> while <b>Feral Frenzy</b> is active to perform a <b>Feral Slash</b>. Hitting a Survivor with <b>Feral Slash</b> puts the Survivor into the injured state, inflicts the <b>Deep Wound</b> status effect, and refills <b>The Legion</b>’s power gauge. Additionally, any Survivors within the Terror Radius not afflicted by the <b>Deep Wound</b> status effect are indicated by Killer Instinct. If a Survivor hit by <b>Feral Slash</b> is already afflicted by the <b>Deep Wound</b> status effect, <b>Feral Frenzy</b> ends immediately. Each successful <b>Feral Slash</b> that does not end <b>Feral Frenzy</b> increases The Legion’s movement speed by <b>0.2m/s</b> for the remainder of <b>Feral Frenzy</b>. The fifth consecutive <b>Feral Slash</b> will put any Survivor into the dying state. The fifth successful <b>Feral Slash</b> always ends <b>Feral Frenzy</b>.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_legion, 14, Arrays.asList(R.drawable.killer_discordance, R.drawable.killer_iron_maiden, R.drawable.killer_mad_grit)),
                new CharacterItem("<font color='#ffffff'><b>PLAGUE</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>VILE PURGE - POWER</b></font><br>" +
                                "Her condition deteriorated as the plague overtook her body: her toes blackened, her neck mushroomed into cysts, and her throat gagged with bloody vomit.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>VILE PURGE</b></font><br>" +
                                "Infect environmental objects and Survivors with <b>Vile Purge</b> to create an unending cycle of sickness. Press and hold the <b>Power button</b> to charge <b>Vile Purge</b>, and release the button to unleash a stream of infectious bile. Hitting a Survivor will cause them to become infected. Hitting an environmental object will cause it to become infected for a short time. Survivors interacting with infected objects will also become infected.<br><br>" +
                                "When a Survivor's infection indicator is completely filled, The Survivor is put into the injured state, is afflicted by the <b>Broken</b> status effect, and forced to vomit at random intervals.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: INGEST CORRUPTION</b></font><br>" +
                                "Infected Survivors can heal themselves to full health and cure their infection by cleansing at a <i>Pool of Devotion</i>. This action corrupts the pool, allowing <b>The Plague</b> to consume the corruption and empower her purge. Press and hold the <i>Interaction button</i> while next to a corrupt <i>Pool of Devotion</i> to transform <b>Vile Purge</b> into <b>Corrupt Purge</b>. This action removes the corruption from the pool.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: CORRUPT PURGE</b></font><br>" +
                                "After using the <b>Ingest Corruption</b> ability, <b>Vile Purge</b> is replaced by <b>Corrupt Purge</b> for a short duration. <b>Corrupt Purge</b> instantly damages any Survivor hit by its stream, however, it no longer applies infection to Survivors or environmental objects.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_plague, 15, Arrays.asList(R.drawable.killer_corrupt_intervention, R.drawable.killer_dark_devotion, R.drawable.killer_infectious_fright)),
                new CharacterItem("<font color='#ffffff'><b>GHOST FACE</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>NIGHT SHROUD - POWER</b></font><br>" +
                                "<b>The Ghost Face</b> used to study his victims for weeks, meticulously registering their habits. When the urge to kill swelled, he’d know exactly how and where to strike.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>NIGHT SHROUD</b></font><br>" +
                                "Press the <i>Power button</i> to activate <b>Night Shroud</b> when the power gauge is full. <b>The Ghost Face</b> is granted the <b>Undetectable</b> status effect while <b>Night Shroud</b> is active. Performing a <i>basic attack</i> fully depletes the power gauge and deactivates <b>Night Shroud</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Reveal:</b></font><br>" +
                                "Survivors within proximity to <b>The Ghost Face</b> may attempt to <i>reveal</i> him by looking in his direction for a short duration. A successful reveal fully depletes <b>The Ghost Face</b>'s power gauge and automatically deactivates <b>Night Shroud</b>. Survivors who reveal <b>The Ghost Face</b> have their current location indicated by <i>Killer Instinct</i> for a very short duration.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: STALK</b></font><br>" +
                                "Hold down the <i>Power button</i> to Stalk Survivors while <b>Night Shroud</b> is active. Hold down the <i>Power button</i> while behind cover to lean out and Stalk at a faster rate. Completing Stalk progress on a Survivor <i>Marks</i> your target and applies the <b>Exposed</b> status effect to your <i>Mark</i> for a limited amount of time. <i>Marked</i> Survivors cannot reveal <b>The Ghost Face</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: CROUCH</b></font><br>" +
                                "Press the <i>Active Ability button</i> to Crouch. Press the <i>Active Ability button</i> again while Crouched to stand. <b>The Ghost Face</b> moves at a slower speed while Crouched.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_ghost_face, 16, Arrays.asList(R.drawable.killer_furtive_chase, R.drawable.killer_im_all_ears, R.drawable.killer_thrilling_tremors)),
                new CharacterItem("<font color='#ffffff'><b>DEMOGORGON</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>OF THE ABYSS - POWER</b></font><br>" +
                                "An unknown and otherworldly power surged through its body. Suddenly the ground ripped open, swallowing The Demogorgon whole.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>OF THE ABYSS</b></font><br>" +
                                "Press and hold the <i>Power button</i> to fully charge and activate <b>Of the Abyss</b>. All Survivors within a close proximity to an activated Portal will be indicated by Killer Instinct.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ATTACK: SHRED</b></font><br>" +
                                "Press the <i>Attack button</i> while charging or holding <b>Of the Abyss</b> to dive forward and unleash a vicious slash.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ATTACK: PORTALS</b></font><br>" +
                                "Press the <i>Active Ability button</i> to open a Portal on the ground in front of you.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Traversed Upside Down:</b></font><br>" +
                                "While standing on a placed Portal with a different Portal highlighted, press the <i>Active Ability button</i> again to travel through the Upside Down to arrive at the targeted Portal.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Activated Portals:</b></font><br>" +
                                "Portals become 'activated' when they are first traversed to or from. Only activated Portals may be sealed by Survivors. Activated Portal auras are highlighted in yellow.",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_demogorgon, 17, Arrays.asList(R.drawable.killer_cruel_limits, R.drawable.killer_mindbreaker, R.drawable.killer_surge)),
                new CharacterItem("<font color='#ffffff'><b>ONI</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>YAMAOKA'S WRAITH - POWER</b></font><br>" +
                                "The desire to destroy weaker bloodlines shaped into a literal force.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>YAMAOKA'S WRAITH</b></font><br>" +
                                "Absorb Blood Orbs left by your injured foes. Press and hold the <i>Power button</i> to absorb Blood Orbs in the environment and fill your power gauge. When your power gauge is full, press and hold the <i>Active Ability button</i> to initiate <b>Blood Fury</b>.<br><br>" +
                                "<b>Blood Fury</b>: While <b>Blood Fury</b> is active, <b>The Oni</b> becomes lethal and gains access to additional abilities: <b>Demon Dash</b> and <b>Demon Strike</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: DEMON DASH</b></font><br>" +
                                "Press and hold the <i>Power button</i> while <b>Blood Fury</b> is active to perform a <b>Demon Dash</b>. This ability allows <b>The Oni</b> to cover large distances at high speed.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: DEMON STRIKE</b></font><br>" +
                                "Press and hold the <i>Attack button</i> while <b>Blood Fury</b> is active to perform a <b>Demon Strike</b> in the direction you are facing. Demon Strike has an extended lunge range and successful hits immediately put healthy Survivors into the dying state.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_oni, 18, Arrays.asList(R.drawable.killer_blood_echo, R.drawable.killer_nemesis, R.drawable.killer_zanshin_tactics)),
                new CharacterItem("<font color='#ffffff'><b>DEATHSLINGER</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>THE REDEEMER - POWER</b></font><br>" +
                                "The Deathslinger’s ingenuity affords him the ability to Reel in bounties with a unique invention—a heavily modified, hybrid rifle that replaces conventional ammunition with a razor-sharp spear affixed to a chain.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>THE REDEEMER</b></font><br>" +
                                "Press and hold the <i>Power button</i> to aim down sights. Press the <i>Attack button</i> to shoot a spear that can lodge itself in a Survivor, allowing them to be Reeled in towards <b>The Deathslinger</b> against their will.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Reel:</b></font><br>" +
                                "While a Survivor is speared by <b>The Redeemer</b>, press and hold the <i>Power button</i> to Reel them in towards you. Survivors may struggle against the chain or use the environment to pressure the chain to break. Doing so will result in briefly stunning <b>The Deathslinger</b> as well as putting The Survivor in the injured state and applying the <b>Deep Wound</b> status effect. Using a <i>basic attack</i> while a Survivor is speared will break the chain without applying a penalty to either <b>The Deathslinger</b> or The Survivor. Successfully hitting a Survivor with a <i>basic attack</i> while they are speared and healthy will also apply the <b>Deep Wound</b> status effect.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Reload:</b></font><br>" +
                                "<b>The Redeemer</b> must be Reloaded after every shot, before it may be fired again. Press the <i>Active Ability button</i> to Reload <b>The Redeemer</b>.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.4m/s&nbsp;(110%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_deathslinger, 19, Arrays.asList(R.drawable.killer_dead_mans_switch, R.drawable.killer_gearhead, R.drawable.killer_hex_retribution)),
                new CharacterItem("<font color='#ffffff'><b>EXECUTIONER</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>RITES OF JUDGEMENT - POWER</b></font><br>" +
                                "Open the gates of suffering and be judged! The Great Knife splits the ground, giving rise to an infernal construct and spreading agony to all who approach.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>RITES OF JUDGEMENT</b></font><br>" +
                                "Hold the <i>Power button</i> to activate, then move in any direction to carve a trail into the ground.<br><br>" +
                                "Survivors who walk or run on the trail will trigger <i>Killer Instinct</i> and be afflicted with <i>Torment</i>. Survivors affected by <i>Torment</i> may be sent to a <b>Cage of Atonement</b> while they are in the dying state.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ATTACK: PUNISHMENT OF THE DAMNED</b></font><br>" +
                                "Press the <i>Attack button</i> while <b>Rites of Judgment</b> is active to perform <b>Punishment of the Damned</b>. This unleashes a wave of force, damaging any Survivors in its path.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: CAGE OF ATONEMENT</b></font><br>" +
                                "Press the <i>Active Ability button</i> while standing over a dying Survivor suffering from <i>Torment</i> to send them to a <b>Cage of Atonement</b>. Survivors in a <b>Cage of Atonement</b> can be sacrificed as if they were on a hook. During the second phase of the summoning ritual they will be forced to complete Skill Checks to hold off The Entity.<br><br>" +
                                "Being rescued or rescuing another Survivor from a <b>Cage of Atonement</b> will remove <i>Torment</i>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: FINAL JUDGEMENT</b></font><br>" +
                                "Press the <i>Active Ability button</i> when standing over a dying Survivor suffering from <i>Torment</i> who has already reached struggle phase on a hook or in a cage to execute them.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_executioner, 20, Arrays.asList(R.drawable.killer_deathbound, R.drawable.killer_forced_penance, R.drawable.killer_trail_of_torment)),
                new CharacterItem("<font color='#ffffff'><b>BLIGHT</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>BLIGHTED CORRUPTION - POWER</b></font><br>" +
                                "Pustula serum courses through his veins, corrupting his mind and body, yet granting him unnatural physical abilities.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: RUSH</b></font><br>" +
                                "Press the <i>Power button</i> to quickly <b>Rush</b> forward. Doing so consumes a <b>Rush</b> token. While performing <b>Rush</b>, <b>The Blight</b> cannot launch an attack.<br><br>" +
                                "<b>Rush</b> into a wall or obstacle in the environment to <b>Slam</b> onto it. If the <b>Rush</b> fails to connect with a wall or obstacle, or if <b>The Blight</b> is out of <b>Rush</b> tokens, he will enter a short fatigue state and begin recharging the tokens.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ATTACK: LETHAL RUSH</b></font><br>" +
                                "Following a <b>Slam</b>, press the <i>Power button</i> to launch a <b>Lethal Rush</b>. Doing so consumes a <b>Rush</b> token. A <b>Lethal Rush</b> behaves the same as a <b>Rush</b>, except that <b>The Blight</b> may launch an attack by pressing the <i>Attack button</i>.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_blight, 21, Arrays.asList(R.drawable.killer_dragons_grip, R.drawable.killer_hex_blood_favor, R.drawable.killer_hex_undying)),
                new CharacterItem("<font color='#ffffff'><b>TWINS</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>BLOOD BOND - POWER</b></font><br>" +
                                "Though forever bound through blood & trauma, The Twins have been granted the power to separate from their shared body. Together they hunt as brother and sister, doubling the threat to Survivors.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>BLOOD BOND</b></font><br>" +
                                "Press and hold the <i>Power button</i> to unleash <b>Victor</b>. Swap control between <b>Charlotte</b> and <b>Victor</b> by tapping the <i>Ability button</i>.<br><br>" +
                                "While left on his own, <b>Victor</b> will trigger <b>Killer Instinct</b>, revealing to <b>Charlotte</b> the outlines of Survivors who are walking or running near him. Survivors who can hear <b>Victor</b>’s shrieks are susceptible. However, <b>Victor</b> can be crushed by Survivors while <b>Charlotte</b> is being controlled.<br><br>" +
                                "If crushed, <b>Victor</b> will re-grow on <b>Charlotte</b> after some time has passed.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ATTACK: POUNCE</b></font><br>" +
                                "While controlling <b>Victor</b>, hold the <i>Ability button</i> to charge a <b>Pounce</b> and tap the <i>Attack button</i> to unleash it.<br><br>" +
                                "Successfully landing a <b>Pounce</b> deals damage to the Survivor. If the Survivor was at full health, <b>Victor</b> will latch on, triggering <b>Killer Instinct</b> and revealing the location of all nearby Survivors. While latched on, the Survivor will be afflicted with the <b>Broken</b>, <b>Oblivious</b>, and <b>Incapacitated</b> status effects. They will be unable to enter lockers or leave through the exit gate. The Survivor can crush <b>Victor</b> while he's latched onto them by completing the <b>Remove</b> action.<br><br>" +
                                "If <b>Victor</b> misses his <b>Pounce</b>, he is momentarily vulnerable and can be crushed by a Survivor. If Victor lands on an obstacle taller than himself, he will be destroyed.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_twins, 22, Arrays.asList(R.drawable.killer_coup_de_grace, R.drawable.killer_hoarder, R.drawable.killer_oppression)),
                new CharacterItem("<font color='#ffffff'><b>TRICKSTER</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>SHOWSTOPPER - POWER</b></font><br>" +
                                "A mesmerizing skill honed through a lifetime of practice, Ji-Woon Hak unleashes a flurry of knives with rapid-fire speed.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SHOWSTOPPER</b></font><br>" +
                                "Start the trial with <b>44 Blades</b>. Press and hold the <i>Power button</i> to wind up and enter the throw state.<br><br>" +
                                "While in the throw state, tap the <i>Attack button</i> to throw a single Blade, or hold down the <i>Attack button</i> to unleash a flurry of Blades. Restock Blades at lockers.<br><br>" +
                                "<b>Laceration Meter</b>: A Survivor’s <b>Laceration Meter</b> increases each time they’re hit by a Blade. Once the meter is filled, they will lose a health state, either becoming injured or downed.<br><br>" +
                                "A Survivor’s Laceration Meter will gradually decrease if they have not been hit by a Blade for a short time. Hitting a Survivor with a <i>basic attack</i> will immediately decrease their Laceration Meter.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: Main Event</b></font><br>" +
                                "Each Blade hit fills the <b>Event Meter</b>. Once full, <b>Main Event</b> can be activated by pressing the <i>Ability button</i>. In this mode, <b>The Trickster</b> automatically throws unlimited Blades for the duration of <b>The Main Event</b>. His throw rate is significantly increased. <b>The Main Event</b> can be canceled by pressing the <i>Ability button</i>. Doing so resets the <b>Event Meter</b> to 0 and initiates a cooldown on <b>Showstopper</b>.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_trickster, 23, Arrays.asList(R.drawable.killer_hex_crowd_control, R.drawable.killer_no_way_out, R.drawable.killer_starstruck)),
                new CharacterItem("<font color='#ffffff'><b>NEMESIS</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>T-VIRUS - POWER</b></font><br>" +
                                "A virus that causes extreme mutations and can be transferred to others. Heightens aggression and strength within The Nemesis.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ATTACK: TENTACLE STRIKE</b></font><br>" +
                                "Press and hold the <i>Power button</i> to charge an attack. Once charged, tap the <i>Attack button</i>. Hitting a Survivor with <b>Tentacle Strike</b> afflicts them with the <b>Contaminated</b> status effect and increases your <b>Mutation Rate</b>. If a Survivor is already <b>Contaminated</b>, <b>Tentacle Strike</b> damages their health and increases <b>Mutation Rate</b>.<br><br>" +
                                "<b>Vaccine</b> found in <b>Supply Cases</b> cures <b>Contamination</b>. Their availability is limited. After using a <b>Vaccine</b>, the Survivor’s location is revealed by Killer Instinct.<br><br>" +
                                "<b>Mutation Rate</b>: Your power expands as your <b>Mutation Rate</b> grows. At <b>Mutation Rate 2</b>, <b>Tentacle Strike</b> can destroy pallets and breakable walls. At <b>Mutation Rate 3</b>, <b>Tentacle Strike</b>’s range and movement speed increase when it's fully charged. The T-Virus icon displays the current <b>Mutation Rate</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ENEMY: ZOMBIES</b></font><br>" +
                                "If a <b>zombie</b> hits a Survivor, they inflict them with the <b>Contaminated</b> effect. If already <b>Contaminated</b>, their health will be damaged.<br><br>" +
                                "<b>Zombies</b> can be destroyed by a <b>Tentacle Strike</b> to increase your <b>Mutation Rate</b>, and Survivors can destroy them with pallets. Destroyed <b>zombies</b> eventually respawn.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_nemesis, 24, Arrays.asList(R.drawable.killer_eruption, R.drawable.killer_hysteria, R.drawable.killer_lethal_pursuer)),
                new CharacterItem("<font color='#ffffff'><b>CENOBITE</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>SUMMONS OF PAIN - POWER</b></font><br>" +
                                "An extradimensional gateway that leads to pleasure and pain so great it will tear your soul apart.<br><br>" +
                                "Press the <i>Power button</i> to create a gateway and release the button to open it. Once opened, tap the <i>Ability button</i> to summon forth a possessed chain under your control. Direct the chain into a Survivor to bind them.<br><br>" +
                                "A Survivor bound to a chain is unable to sprint. Their movement speed will decrease further as they’re hit with a second and third chain. Survivors can perform the Break Free action to escape.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Lament Configuration:</b></font><br>" +
                                "If left alone, the <b>Lament Configuration</b> initiates a Chain Hunt by summoning chains to pursue Survivors.<br><br>" +
                                "A Survivor carrying the <b>Lament Configuration</b> will be afflicted with the <b>Oblivious</b> status effect and chains will occasionally be summoned to attack them. The Survivor must solve the <b>Lament Configuration</b> to end the Chain Hunt and remove the puzzle box from their possession. While doing this, <b>The Cenobite</b> will see their location and be able to teleport to it.<br><br>" +
                                "When <b>The Cenobite</b> picks up the <b>Lament Configuration</b>, a Chain Hunt is activated. Additionally, all Survivors are instantly bound by chains, causing them to scream and reveal their locations.<br><br>" +
                                "The <b>Lament Configuration</b> will spawn in a new location after <b>The Cenobite</b> or a Survivor has used it.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_cenobite, 25, Arrays.asList(R.drawable.killer_deadlock, R.drawable.killer_hex_plaything, R.drawable.killer_scourge_hook_gift_of_pain)),
                new CharacterItem("<font color='#ffffff'><b>ARTIST</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>BIRDS OF TORMENT - POWER</b></font><br>" +
                                "From a wellspring of eternal agony comes a swarm of darkness, a wild and ferocious murder of ink black crows.<br><br>" +
                                "Press and hold the <i>Power button</i> to charge <b>Birds of Torment</b>. Once fully charged, tap the <i>Attack button</i> to summon a Dire Crow. You can repeat the action quickly by continuously holding down the <i>Power button</i> and tapping the <i>Attack Button</i> again.<br><br>" +
                                "When at least one Dire Crow is summoned, it stays idle for a limited time. Spawning a new Dire Crow will extend the time the previously spawned Dire Crow stays idle.<br><br>" +
                                "Tap the <i>Ability button</i> to propel the Dire Crows into flight.<br><br>" +
                                "Dire Crows can inflict damage for a short distance when flying. This is indicated to the Killer by the Dire Crow's Flight Path.<br><br>" +
                                "Once a Dire Crow continues past the Flight Path, it will no longer inflict damage but can now pass through any obstacles and reveal nearby Survivors using Killer Instinct.<br><br>" +
                                "In this phase, Dire Crows will create a swarm around Survivors they hit, allowing the Killer to see the swarm's aura on the Survivor. The Survivor can repel the swarm by completing the Repel action or entering a locker. During this time, the swarm's aura is not shown to the Killer.<br><br>" +
                                "A Survivor being swarmed will receive damage if hit by a second Dire Crow.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_artist, 26, Arrays.asList(R.drawable.killer_grim_embrace, R.drawable.killer_hex_pentimento, R.drawable.killer_scourge_hook_pain_resonance)),
                new CharacterItem("<font color='#ffffff'><b>ONRYŌ</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>DELUGE OF FEAR - POWER</b></font><br>" +
                                "Through the medium of a mysterious videotape, Sadako spreads her curse to unwitting viewers and causes their untimely deaths.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: MANIFESTATION</b></font><br>" +
                                "Before Manifesting, <b>The Onryō</b> becomes <b>Undetectable</b> and invisible to Survivors, but intermittently visible when within <b>24 meters</b> of them. <b>The Onryō</b> must Manifest to attack Survivors. Press and hold the <i>Power button</i> to Manifest in your current position. Briefly after <b>Manifesting</b>, <b>The Onryō</b> will continue to be intermittently visible to Survivors when within <b>24 meters</b>. Afterward, she will be fully visible within <b>24 meters</b> for as long as she remains <b>Manifested</b>. <b>The Onryō</b> can <b>Demanifest</b> by pressing and holding the <i>Power button</i>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: PROJECTION</b></font><br>" +
                                "<b>The Onryō</b> can also take material form by <b>Projecting</b> herself through a TV. Press the <i>Ability button</i> while looking at a powered TV to <b>Project</b> into it, shutting the TV off in the process.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SURVIVOR AFFLICTION: CONDEMNED</b></font><br>" +
                                "Survivors can temporarily turn off TVs with the <b>Retrieve Tape</b> action. At the TV furthest from their position, Survivors can spread <b>The Onryō</b>'s message by inserting their Tape, which reduces their <b>Condemned</b> progress; this also turns the TV off.<br><br>" +
                                "When the power meter is full and <b>The Onryō</b> <b>Projects</b>, any Survivor near a powered TV will gain <b>Condemned</b> progress.<br><br>" +
                                "Hooking a Survivor affected by <b>Condemned</b> locks in <b>3</b> of their stacks, making it impossible to remove them for the rest of the trial.<br><br>" +
                                "A fully <b>Condemned</b> Survivor is revealed by <b>Killer Instinct</b> and can be killed once downed.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;24m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;SHORT",
                        R.drawable.character_killer_onryo, 27, Arrays.asList(R.drawable.killer_call_of_brine, R.drawable.killer_merciless_storm, R.drawable.killer_scourge_hook_floods_of_rage)),
                new CharacterItem("<font color='#ffffff'><b>ONRYŌ</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>REIGN OF DARKNESS - POWER</b></font><br>" +
                                "Like a dark thought, The Dredge is difficult to shake. And when night falls, it is nearly impossible.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: THE GLOAMING</b></font><br>" +
                                "Press and hold the <i>Power button</i> to activate. Once activated, <b>The Dredge</b> leaves a Remnant behind. Aim at a locker and press the <i>Ability button</i> to Teleport into it or press the <i>Attack button</i> to return to the Remnant. The Remnant is disabled when teleporting to a locker, or when a Survivor touches it. While in a locker, aim at any other locker and press the <i>Ability button</i> to Teleport again. Each Teleport consumes a Power Token. Exiting the locker or returning to your Remnant will activate The Gloaming's cooldown, after which all Power Tokens are recharged.<br><br>" +
                                "Survivors can place locks on lockers to slow <b>The Dredge</b> exiting them. <b>The Dredge</b> can break locks by exiting the locked locker or performing a <i>base attack</i> on the lock. Each locker can only be locked once.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: NIGHTFALL</b></font><br>" +
                                "The <b>Nightfall Meter</b> builds when a healthy Survivor is injured, a Survivor is hooked, or the Teleport power is used. The <b>Nightfall Meter</b> also fills faster for each Survivor in the injured state. Once the <b>Nightfall Meter</b> is full, <b>Nightfall</b> begins.<br><br>" +
                                "During <b>Nightfall</b>, Survivors must navigate in total darkness, The Dredge’s Teleport is faster with a shorter cooldown, and gains <b>Undetectable</b>. <b>Nightfall</b> ends after 60 seconds.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_dredge, 28, Arrays.asList(R.drawable.killer_darkness_revealed, R.drawable.killer_dissolution, R.drawable.killer_septic_touch)),
                new CharacterItem("<font color='#ffffff'><b>MASTERMIND</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>VIRULENT BOUND - POWER</b></font><br>" +
                                "<b>The Mastermind</b> can barrel forward, Infecting Survivors with the Uroboros virus or leaping over obstacles.<br><br>" +
                                "Press and hold the <i>Power button</i> to charge a <b>Bound</b> attack. While charging, <b>The Mastermind</b> moves slightly slower as he prepares his strike. When charged, press the <i>Attack button</i> to <b>Bound</b>. If <b>The Mastermind</b> hits a Survivor, that Survivor becomes Infected (or furthers their Infection). Should <b>The Mastermind</b> crash into something during this <b>Bound</b>, he will slam the Survivor, causing damage; if not, the Survivor is thrown, losing a health state if they are thrown into any solid object.<br><br>" +
                                "If <b>Virulent Bound</b> hits a dropped pallet or vault location, <b>The Mastermind</b> vaults over the obstacle.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL EFFECTS - UROBOROS INFECTION</b></font><br>" +
                                "Upon being hit by <b>Virulent Bound</b>, Survivors become Infected. Infected builds over time, and when fully Infected, the Survivor suffers from the <b>Hindered</b> status effect. If a <b>Virulent Bound</b> grabs and slams a Survivor while they are fully Infected, <b>The Mastermind</b> will automatically carry them.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL INTERACTION: FIRST AID SPRAY</b></font><br>" +
                                "At the beginning of each trial, several Supply Crates spawn. Each contains a First Aid Spray. When Infected, a Survivor can use the First Aid Spray on themselves or another, removing the Infection. Each First Aid Spray has a set number of charges. After using a First Aid Spray, the Survivor's location is briefly revealed by <b>Killer Instinct</b>.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;40m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_mastermind, 29, Arrays.asList(R.drawable.killer_awakened_awareness, R.drawable.killer_superior_anatomy, R.drawable.killer_terminus)),
                new CharacterItem("<font color='#ffffff'><b>KNIGHT</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>GUARDIA COMPAGNIA - POWER</b></font><br>" +
                                "<b>The Knight</b> alone is a terrifying monster on the battlefield, but with his loyal Guards, he is nearly unstoppable. Together, the <b>Guardia Compagnia</b> fights for their own freedom, killing anyone who gets in their way.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: GUARD SUMMON</b></font><br>" +
                                "Tap the <i>Power button</i> to activate Guard Summon mode. Once activated, move around to create a Patrol Path. While in Guard Summon mode, you can aim at a generator in progress, a downed pallet or a breakable wall and tap the <i>Attack button</i>. This will summon a Guard to complete a break action on the selected object. You can also tap the <i>Power button</i> or drain the Power Gauge completely to end the <b>Guard Summon</b> mode. This will summon a Guard who will follow and Patrol the created Path. The longer the Patrol Path, the longer the Guard's Hunt Timer will be. There are three Guards that can be summoned one at a time: <b>The Carnifex</b>, who can break or damage objects faster; <b>The Assassin</b>, who moves faster during the Hunt; and <b>The Jailer</b>, who patrols and hunts longer, and is better at detection.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>GUARD SPECIAL ABILITY: THE HUNT</b></font><br>" +
                                "While a Guard is patrolling, he can spot and detect Survivors. If a Survivor is detected, the Guard will move to their location, leave a Standard on the ground, and start Hunting the Survivor for a set amount of time. The Survivor can escape a Guard by unhooking another Survivor, grabbing the Standard, or surviving until the Hunt timer ends. If the Survivor is successfully attacked by the Guard or <b>The Knight</b>, the Guard will disappear. When a Guard downs a Survivor, <b>The Knight</b> receives a <b>Killer Instinct</b> notification.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_knight, 30, Arrays.asList(R.drawable.killer_hex_face_the_darkness, R.drawable.killer_hubris, R.drawable.killer_nowhere_to_hide)),
                new CharacterItem("<font color='#ffffff'><b>SKULL MERCHANT</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>EYES IN THE SKY - POWER</b></font><br>" +
                                "Inspired by the dark mangas created by her father, The Skull Merchant relentlessly hunts her prey using the latest in surveillance technology.<br><br>" +
                                "<b>The Skull Merchant</b> begins the match with six Drones. Press the <i>Power button</i> to deploy a Drone. Deploying a Drone grants <b>Undetectable</b> for 8 seconds. Once detected by a scan line, a Survivor gains scan immunity and cannot be detected by other scan lines for a few seconds.<br><br>" +
                                "Survivors can attempt to hack Drones. Failure partially fills their <b>Lock On</b> meter; Success disables the Drone for 45 seconds.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: RADAR</b></font><br>" +
                                "Press the <i>Ability Button</i> to open a Radar to see the locations of Survivors detected by Drones and those with <b>Claw Traps</b>. The Radar can be used to change a Drone's rotation direction or to recall a Drone. When a Survivor is detected by a Drone shortly after its deployment or change in rotation, <b>The Skull Merchant</b> gains bonus movement speed for a short duration.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL EFFECT: LOCK ON</b></font><br>" +
                                "The <b>Lock On</b> meter fills when scanned by a Drone and when failing to disable a Drone. When the meter is full, the Survivor receives a <b>Claw Trap</b>, becomes Injured, and suffers from the <b>Broken</b> status effect. Additional scans briefly apply the <b>Hindered</b> status effect. A <b>Claw Trap</b> broadcasts the Survivor’s location to the Killer and is only removed when its battery dies.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_skull_merchant, 31, Arrays.asList(R.drawable.killer_game_afoot, R.drawable.killer_leverage, R.drawable.killer_thwack)),
                new CharacterItem("<font color='#ffffff'><b>SINGULARITY</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>QUANTUM INSTANTIATION - POWER</b></font><br>" +
                                "A dark crystalline structure in an ancient ruin gifted—or perhaps cursed—Hux with sentience. He built a new body, and with it, a terrifying way to bend the rules of physics to his benefit.<br><br>" +
                                "<b>The Singularity</b> can shoot and spawn Biopods around the map; these Biopods can attach to any vertical surface they land on. <b>The Singularity</b> can control a Biopod remotely and look through it, and tag Survivors, afflicting them with a Temporal Slipstream. When Slipstreamed, <b>The Singularity</b> can teleport next to the Slipstreamed Survivor either by using the Biopods to tag them, or by shooting them. When a Slipstreamed Survivor is in proximity to another Survivor, the Slipstream can spread. All Slipstreamed Survivors are briefly revealed with <b>Killer Instinct</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL STATE: OVERCLOCK MODE</b></font><br>" +
                                "After a successful Slipstream teleport, <b>the Singularity</b> enters <b>Overclock Mode</b>. In this state, walls and pallets can be destroyed faster, vaulting speed is faster, and he cannot be stunned. Attempts to stun merely remove <b>Overclock Mode</b> and momentarily slow <b>the Singularity</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL INTERACTION: ELECTROMAGNETIC IMPULSE</b></font><br>" +
                                "At the beginning of each Trial, several Supply Cases spawn, each containing an EMP. Survivors can use these EMPs to remove the Slipstream from themselves or others, or to briefly disable a Biopod. Once used, the EMP is destroyed.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_singularity, 32, Arrays.asList(R.drawable.killer_forced_hesitation, R.drawable.killer_genetic_limits, R.drawable.killer_machine_learning)),
                new CharacterItem("<font color='#ffffff'><b>XENOMORPH</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>HIDDEN PURSUIT - POWER</b></font><br>" +
                                "Supposedly responding to a distress signal, the Nostromo's crew landed on LV-426. What they found there became one of humanity's greatest horrors.<br><br>" +
                                "When <b>The Xenomorph</b> is in a trial, a series of tunnels become available to it. By accessing a Control Station, it can enter these tunnels to quickly move around the map, detect the presence of nearby Survivors, and speed up the cooldown time of its Crawler Mode. Exiting a Control Station momentarily deactivates deployed Turrets and tags nearby Survivors with <b>Killer Instinct</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: CRAWLER MODE</b></font><br>" +
                                "<b>The Xenomorph</b> enters Crawler Mode automatically when not on cooldown. In <b>Crawler Mode</b>, <b>The Xenomorph</b> walks on four legs and becomes stealthier, reducing its Terror Radius. While in <b>Crawler Mode</b>, <b>The Xenomorph</b> also has access to a brutal Tail Attack.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL MAP FEATURE: CONTROL STATIONS</b></font><br>" +
                                "Seven Control Stations are scattered across the map. Survivors can interact with these stations to get a Remote Flame Turret, while <b>The Xenomorph</b> can enter and exit the tunnels underneath the <b>Control Stations</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ITEM: REMOTE FLAME TURRET</b></font><br>" +
                                "Turrets can be placed in the map to counteract <b>The Xenomorph</b>. When <b>The Xenomorph</b> enters the radius and line of sight of a Turret, the Turret attacks; this attack staggers <b>The Xenomorph</b> and can cause <b>Crawler Mode</b> to end. If a Turret successfully knocks <b>The Xenomorph</b> out of <b>Crawler Mode</b> or fires for too long, it overheats, and must be repaired by a Survivor. <b>The Xenomorph</b> can attack Turrets to destroy them. Carrying a Turret makes you immune to detection while the killer is in the tunnel.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_xenomorph, 33, Arrays.asList(R.drawable.killer_alien_instinct, R.drawable.killer_rapid_brutality, R.drawable.killer_ultimate_weapon)),
                new CharacterItem("<font color='#ffffff'><b>GOOD GUY</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>PLAYTIME'S OVER - POWER</b></font><br>" +
                                "After the rage of being trapped in the body of a doll subsided, the Lakeshore Strangler realized this new body was the perfect host to disorient and surprise his kills.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: HIDEY-HO MODE</b></font><br>" +
                                "<b>Chucky</b> can enter <b>Hidey-Ho Mode</b> at any time, provided the cooldown is over. When in <b>Hidey-Ho Mode</b>, <b>Chucky</b> becomes <b>Undetectable</b> and generates map-wide Footfalls, disorienting Survivors with sounds and footprints coming from many directions.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: SLICE & DICE</b></font><br>" +
                                "While in <b>Hidey-Ho Mode</b>, <b>Chucky</b> gets access to the charged <b>Slice & Dice</b> ability, allowing him to rush unsuspecting Survivors before leaping forward and performing a <b>Slice & Dice</b> attack. Additionally, <b>Chucky</b> can quickly chain a <b>Scamper</b> while using a <b>Slice & Dice</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: SCAMPER</b></font><br>" +
                                "While in <b>Hidey-Ho Mode</b>, <b>Chucky</b> can perform a <b>Scamper</b> through windows or under downed pallets, allowing him to close on his unsuspecting prey.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.4m/s&nbsp;(110%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;SHORT",
                        R.drawable.character_killer_good_guy, 34, Arrays.asList(R.drawable.killer_batteries_included, R.drawable.killer_friends_til_the_end, R.drawable.killer_hex_two_can_play)),
                new CharacterItem("<font color='#ffffff'><b>UNKNOWN</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>UVX - POWER</b></font><br>" +
                                "Some believed a specimen was recovered by the military for their experiments. The codename: Unknown Venom X.<br><br>" +
                                "Press the <i>Power button</i> to charge <b>UVX</b>. Once ready, press the <i>Attack button</i> to launch <b>UVX</b>, a bouncing Projectile which creates a Blast Area upon impact. Survivors become <b>Hindered</b> if touched by <b>UVX</b> while airborne.<br><br>" +
                                "Survivors touching the Blast Area become <b>Weakened</b>. <b>Weakened</b> Survivors lose health states if touched by Blast Areas. Survivors lose <b>Weakened</b> by successfully Staring Down <b>The Unknown</b>.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: HALLUCINATIONS</b></font><br>" +
                                "<b>The Unknown</b> will intermittently create up to <b>4 Hallucinations</b>. <b>Hallucinations</b> cannot be created while charging <b>UVX</b>, performing interactions, or in proximity to map objects like hooks.<br><br>" +
                                "Whenever Survivors are touched by Blast Areas or otherwise become <b>Weakened</b>, the next <b>Hallucination</b>'s spawn time decreases by 10 seconds.<br><br>" +
                                "<b>The Unknown</b> can Teleport to <b>Hallucinations</b>, leaving behind a temporary Decoy. Survivors can remove <b>Hallucinations</b> from the trial with the Dispel ability. <b>Weakened</b> Survivors take longer to Dispel. If Dispel is not completed, Survivors become <b>Weakened</b> and trigger <b>Killer Instinct</b>.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_unknown, 35, Arrays.asList(R.drawable.killer_unbound, R.drawable.killer_undone, R.drawable.killer_unforeseen)),
                new CharacterItem("<font color='#ffffff'><b>LICH</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>VILE DARKNESS - POWER</b></font><br>" +
                                "Bound with the skin and flesh of men, the Book is packed with spells both forbidden and wicked.<br><br>" +
                                "To select a Spell, hold <i>Ability button 1</i> to open the Spell selection. <b>The Lich</b> has <b>4</b> different Spells:" +
                                "<ul><li><b>Mage Hand</b>: Creates a magical hand that lifts downed pallets or blocks upright pallets for 4 seconds.</li><br>" +
                                "<li><b>Flight of the Damned</b>: Conjures 5 flying entities that pass through obstacles and injure Survivors.</li><br>" +
                                "<li><b>Dispelling Sphere</b>: Casts a moving invisible sphere that reveals Survivors & temporarily disables Magic Items.</li><br>" +
                                "<li><b>Fly</b>: Briefly move faster, ignoring vaults and pallets.</li></ul>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ITEM: MAGIC ITEMS</b></font><br>" +
                                "Treasure Chests found around the map can contain Magic Items for Survivors to equip. These include Boots/Gauntlets of:" +
                                "<ul><li><b>The Interloper</b>: When Mage Hand is used, reveals aura of affected pallets and applies Haste for 3 seconds.</li><br>" +
                                "<li><b>The Nightwatch</b>: Reveals auras of Flight of the Damned.</li><br>" +
                                "<li><b>The Archivist</b>: Makes Dispelling Sphere visible.</li><br>" +
                                "<li><b>The Skyguard</b>: Reveals <b>The Lich</b>'s aura during Fly and for a few seconds after.</li></ul>" +
                                "Additionally, upon procurement, all Magic Items briefly reveal <b>Vecna</b>'s aura.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ITEMS: HAND & EYE OF VECNA</b></font><br>" +
                                "Rarely, Treasure Chests contain the <b>Hand</b> or <b>Eye of Vecna</b>. When picked up and used by a Survivor at full health, they cost them a health state, reveal their location with <b>Killer Instinct</b> for 3 seconds, and grant them a <i>special ability</i>." +
                                "<ul><li><b>Hand of Vecna</b>: A Fast Locker Entry teleports the Survivor to a further locker.</li><br>" +
                                "<li><b>Eye of Vecna</b>: A Fast Locker Exit hides the Survivor's aura and grants Haste for 12 seconds.</li></ul></font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_lich, 36, Arrays.asList(R.drawable.killer_dark_arrogance, R.drawable.killer_languid_touch, R.drawable.killer_weave_attunement)),
                new CharacterItem("<font color='#ffffff'><b>DARK LORD</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>VAMPIRIC SHIFT - POWER</b></font><br>" +
                                "His dark power allows him to exact revenge on humans, taking many forms to terrorize and slaughter them.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: SHAPESHIFT</b></font><br>" +
                                "<b>The Dark Lord</b> has access to three Forms and can freely change between them. Each Form has unique abilities and strengths.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Vampiric Form:</b></font><br>" +
                                "In his default state, <b>The Dark Lord</b> can use the powerful Hellfire spell, which creates seven pillars of flame that erupt from the ground in front of him and can be cast across low obstacles.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Wolf Form:</b></font><br>" +
                                "In <b>Wolf Form</b>, <b>The Dark Lord</b> has access to several abilities that allow for more effective tracking. Blood pools and scratch marks are more apparent, and running Survivors leave a trail of Scent Orbs behind them. <b>The Dark Lord</b> can collect these Scent Orbs to charge a powerful Pounce attack and gain a short non-stacking haste buff.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>Bat Form:</b></font><br>" +
                                "While in <b>Bat Form</b>, <b>The Dark Lord</b> gains the <b>Undetectable</b> status effect. Additionally, he moves faster, ignores vault points, and can Teleport to any vault points within 32 meters. Survivors become invisible, but scratch marks can be seen.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;TALL",
                        R.drawable.character_killer_dark_lord, 37, Arrays.asList(R.drawable.killer_dominance, R.drawable.killer_hex_wretched_fate, R.drawable.killer_human_greed)),
                new CharacterItem("<font color='#ffffff'><b>HOUNDMASTER</b></font>",
                        "<font color='#aaa9a9'><font color='#ffffff'><b>SCENT OF BLOOD - POWER</b></font><br>" +
                                "The Houndmaster and her dog operate as one. Her commands are followed without question or delay.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: CHASE</b></font><br>" +
                                "<b>The Chase</b> Command sends the dog out at high speed. Pressing the <i>Power button</i> again redirects <b>the Chase</b>, pivoting the dog's path. When the dog catches a Survivor, the dog starts a Grab. The Survivor becomes <b>Hindered</b> and is pulled toward <b>The Houndmaster</b>. The Survivor can get free by stunning the dog or can be rescued by another Survivor. Grabs that end without injury leave the Survivor <b>Hindered</b>. Grab duration is shorter for Survivors with the <b>Endurance</b> status effect.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL ABILITY: SEARCH</b></font><br>" +
                                "<b>The Search</b> Command sends the dog to a target location, creating a <b>Search</b> Path. It has its own lullaby and, as it moves, its <b>Houndsense</b> radius rises over distance traveled. Survivors who enter the radius are affected by <b>Houndsense</b> and revealed by <b>Killer Instinct</b>. If <b>The Houndmaster</b> follows the dog’s Search Path, she gains increased movement speed over time. Leaving the <b>Search</b> Path ends the bonus movement speed.<br><br>" +
                                "<font color='#aaa9a9'><font color='#ffffff'><b>SPECIAL EFFECT: HOUNDSENSE</b></font><br>" +
                                "Healthy Survivors affected by <b>Houndsense</b> receive <b>Deep Wounds</b> when injured. Injured Survivors affected by <b>Houndsense</b> suffer from louder grunts of pain and longer pools of blood when put into the dying state.</font>",

                        "<font color='#aaa9a9'><img src='data:image/png;base64," + movementSpeed + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;4.6m/s&nbsp;(115%)<br><br>" +
                                "<img src='data:image/png;base64," + terrorRadius + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;32m<br><br>" +
                                "<img src='data:image/png;base64," + height + "' width='30' height='30' style='vertical-align: -7px;'/>&nbsp;&nbsp;&nbsp;AVERAGE",
                        R.drawable.character_killer_houndmaster, 38, Arrays.asList(R.drawable.killer_all_shaking_thunder, R.drawable.killer_no_quarter, R.drawable.killer_scourge_hook_jagged_compass))
        );
    }
}
