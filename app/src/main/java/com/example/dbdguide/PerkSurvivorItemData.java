package com.example.dbdguide;

import java.util.Arrays;
import java.util.List;

public class PerkSurvivorItemData {



    // Static method to return a list of ButtonItems
    public static List<PerkItem> getButtonItems() {

        String blindness = "<font color='#e7daa2'><i>Blindness prevents Survivors from seeing auras.</i></font>";
        String boon = "Press and hold the <i>Ability Button 1</i> near a Dull or Hex Totem to bless it and create a Boon Totem. Soft chimes ring out in a <font color='#ffff1a'><b>24&nbsp;meter</b></font> range.";
        String broken = "<font color='#e7daa2'><i>Broken prevents Survivors from being healed.</i></font>";
        String deep_wound = "<font color='#e7daa2'><i>Deep Wound will put a Survivor in the dying state unless it is mended before the timer runs out.</i></font>";
        String endurance = "<font color='#e7daa2'><i>Endurance prevents a Survivor from being downed, inflicting Deep Wound instead.</i></font>";
        String exhaustion = "<font color='#e7daa2'><i>Exhausted prevents Survivors from activating exhausting perks.</i></font>";
        String exposed = "<font color='#e7daa2'><i>Exposed Survivors will be downed by basic attacks even if uninjured.</i></font>";
        String haste = "<font color='#e7daa2'><i>Haste increases Killer movement speed.</i></font>";
        String hemorrhage = "<font color='#e7daa2'><i>Hemorrhage regresses healing progress when not healing, and increases blood trails left by injured Survivors. This lasts for a set duration or until healed.</i></font>";
        String hex = "<font color='#e7daa2'><i>The Hex effects persist as long as the related Hex Totem is standing.</i></font>";
        String hindered = "<font color='#e7daa2'><i>Hindered reduces Survivor movement speed.</i></font>";
        String mangled = "<font color='#e7daa2'><i>Mangled increases time required to heal by 25% and lasts for a set duration or until fully healed.</i></font>";
        String oblivious = "<font color='#e7daa2'><i>Oblivious prevents Survivors from hearing or being affected by the Killer's Terror Radius.</i></font>";
        String obsessed = "<font color='#e7daa2'><i>The Killer can only be obsessed with one Survivor at a time.</i></font>";
        String undetectable = "<font color='#e7daa2'><i>Undetectable hides the Killer's aura, Terror Radius, and Red Stain.</i></font>";

        return Arrays.asList(
                new PerkItem("<font color='#ffffff'><b>ACE IN THE HOLE</b></font>",
                        "<font color='#aaa9a9'>Lady Luck always seems to be throwing something good your way." +
                                "<ul><li>When retrieving an item from a chest, there is a <font color='#ffff1a'><b>100%</b></font> chance that a <font color='#ff8800'><b>Ultra Rare</b></font> (or lower) add-on will be attached to it.</li><br>" +
                                "<li><font color='#ffff1a'><b>50</font>/<font color='#199b1e'>75</font>/<font color='#ac3ee3'>100</b></font> %  chance of finding a second add-on of <font color='#ff0808'><b>Uncommon</b></font> rarity (or lower).</li><br>" +
                                "<li>When escaping, keep any add-ons your item has.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Everything that glitters isn't gold. But gold isn't worth a damn in this place, so this should come in handy.&quot; —&#8288;Ace</i></font>",
                        R.drawable.survivor_ace_in_the_hole, Arrays.asList("Ace", "Item"),33),
                new PerkItem("<font color='#ffffff'><b>ADRENALINE</b></font>",
                        "<font color='#aaa9a9'>You are fuelled by unexpected energy when on the verge of escape.<br><br>" +
                                "This perk activates when the exit gates are powered." +
                                "<ul><li>Instantly heal one health state if you are injured or in the dying state and sprint at <font color='#ffff1a'><b>150%</b></font> of your normal running speed for " +
                                "<font color='#ff8800'><b>3&nbsp;seconds</b></font>.</li></ul>" +
                                "<i>Adrenaline</i> ignores the <font color='#ffffff'><b>Exhausted</b></font> status effect.<br><br>" +
                                "Causes the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.<br><br></font>" + exhaustion,
                        R.drawable.survivor_adrenaline, Arrays.asList("Meg", "End Game", "Exhaustion", "Healing"),18),
                new PerkItem("<font color='#ffffff'><b>AFTERCARE</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability.<br><br>" +
                                "You see the aura of every Survivor that:" +
                                "<ul><li>You rescue from a hook, or rescues you from a hook.</li><br>" +
                                "<li>You complete a healing action on, or completes a healing action on you.</li></ul>" +
                                "They also see your aura.<br><br>" +
                                "This occurs for up to <font color='#ffff1a'><b>1</font>/<font color='#199b1e'>2</font>/<font color='#ac3ee3'>3</b></font> Survivors. All effects of <i>Aftercare</i> are reset when you are hooked by The Killer.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;A Mercy that Rips the Storm.&quot;<br>" +
                                "Oil work to honor my best buddies who happen to be the best musicians I know. Their first album is still my favorite. It got me through a dark time in my life. —&#8288;Jeff, oil on canvas, 16x16</i></font>",
                        R.drawable.survivor_aftercare, Arrays.asList("Jeff", "Aura", "Hook"),57),
                new PerkItem("<font color='#ffffff'><b>ALERT</b></font>",
                        "<font color='#aaa9a9'>Your acute senses are on high alert." +
                                "<ul><li>When the Killer performs a break action, the Killer is revealed to you for " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> seconds.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;I have true sight.&quot; —&#8288;Feng Min</i></font>",
                        R.drawable.survivor_alert, Arrays.asList("Feng", "Killer Aura"),39),
                new PerkItem("<font color='#ffffff'><b>ANY MEANS NECESSARY</b></font>",
                        "<font color='#aaa9a9'>You stand up for yourself, using whatever's on hand to gain an advantage.<br><br>" +
                                "You see the auras of dropped Pallets." +
                                "<ul><li>Press and hold the <i>Active Ability Button 1</i> for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>5</font>/<font color='#ac3ee3'>4</b></font> seconds while standing beside a dropped pallet to reset it to its upright position.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;I'll hit you with everything I've got. Then I'll do it again.&quot; —&#8288;Yui Kimura</i></font>",
                        R.drawable.survivor_any_means_necessary, Arrays.asList("Yui", "Pallet"),72),
                new PerkItem("<font color='#ffffff'><b>APPRAISAL</b></font>",
                        "<font color='#aaa9a9'>You have a careful eye that notices what many overlook.<br><br>" +
                                "Start the trial with <font color='#ff8800'><b>3&nbsp;tokens</b></font>. When a chest has already been opened, consume a token to rummage through it for an item. Rummaging can only be performed once per chest." +
                                "<ul><li>You rummage through chests <font color='#ffff1a'><b>40</font>/<font color='#199b1e'>60</font>/<font color='#ac3ee3'>80</b></font> % faster.</li></ul></font>",
                        R.drawable.survivor_appraisal, Arrays.asList("Élodie", "Item"),84),
                new PerkItem("<font color='#ffffff'><b>AUTODIDACT</b></font>",
                        "<font color='#aaa9a9'><ul><li>You start the trial with a <font color='#ffff1a'><b>-15%</b></font> progress penalty for Skill Checks to heal other Survivors.</li><br>" +
                                "<li>For every successful Skill Check while healing another Survivor, you receive a token up to a maximum of " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> tokens.</li><br>" +
                                "<li>Each token grants you a <font color='#ff8800'><b>+15%</b></font> progress bonus.</li></ul>" +
                                "Great Skill Checks cannot be performed while using <i>Autodidact</i>.<br><br>" +
                                "<i>Autodidact</i> is not active when using a Med-Kit to heal.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;There's no limit to what you can achieve, as long as you back it up with hard work.&quot; —&#8288;Adam Francis</i></font>",
                        R.drawable.survivor_autodidact, Arrays.asList("Adam", "Healing"),54),
                new PerkItem("<font color='#ffffff'><b>BABYSITTER</b></font>",
                        "<font color='#aaa9a9'>While you have a reputation for being self-centered, you risk it all to help those in need." +
                                "<ul><li>When you unhook a Survivor, they won't leave scratch marks or pools of blood, and they gain a <font color='#ffff1a'><b>10%</b></font> <font color='#ffffff'><b>Haste</b></font> status effect for " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> seconds.</li><br>" +
                                "<li>You see the Killer's aura for <font color='#ff8800'><b>8 seconds</b></font>.</li></ul></font>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I promised to keep you shitheads safe, and that's exactly what I plan on doing.&quot; —&#8288;Steve Harrington</i></font>",
                        R.drawable.survivor_babysitter, Arrays.asList("Steve", "Guardian", "Haste", "Hook", "Killer Aura"),69),
                new PerkItem("<font color='#ffffff'><b>BACKGROUND PLAYER</b></font>",
                        "<font color='#aaa9a9'>You're not usually the center of attention. In some cases, this can be a good thing.<br><br>" +
                                "When the Killer picks-up another Survivor, <i>Background Player</i> activates for <font color='#ffff1a'><b>10 seconds</b></font>." +
                                "<ul><li>When you start running, break into a sprint at <font color='#ff8800'><b>150%</b></font> of your normal Running Movement speed for <font color='#ff0808'><b>5 seconds</b></font>.</li></ul>" +
                                "<i>This perk cannot be used while <font color='#ffffff'><b>Exhausted</b></font></i>.<br><br>" +
                                "This perk causes the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>20</b></font> seconds.<br><br>" + exhaustion + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;You forget about me?&quot; —&#8288;Renato Lyra</i></font>",
                        R.drawable.survivor_background_player, Arrays.asList("Renato", "Exhaustion"),120),
                new PerkItem("<font color='#ffffff'><b>BALANCED LANDING</b></font>",
                        "<font color='#aaa9a9'>Your agility is incomparable." +
                                "<ul><li>After falling from a height, cat-like reflexes reduce your stagger duration from falling by <font color='#ffff1a'><b>75%</b></font> and reduce the volume of grunts from falling by <font color='#ffff1a'><b>100%</b></font>.</li><br>" +
                                "<li>You start sprinting at <font color='#ff8800'><b>150%</b></font> your normal running speed for a maximum of <font color='#ff0808'><b>3&nbsp;seconds</b></font>.</li></ul>" +
                                "Causes the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.<br><br>" +
                                "<i>Balanced Landing cannot be used while <font color='#ffffff'><b>Exhausted</b></font></i>.<br><br>" + exhaustion + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I've jumped from higher places.?&quot; —&#8288;Nea</i></font>",
                        R.drawable.survivor_balanced_landing, Arrays.asList("Nea", "Exhaustion"),27),
                new PerkItem("<font color='#ffffff'><b>BARDIC INSPIRATION</b></font>",
                        "<font color='#aaa9a9'>It's time to give your audience a show. Will you bring the house down or will you choke?<br><br>" +
                                "Press the <i>Ability Button 1</i> while standing and motionless to enter the performance interaction that lasts up to <font color='#ffff1a'><b>15&nbsp;seconds</b></font> and empowers Survivors within " +
                                "<font color='#ff8800'><b>16&nbsp;meters</b></font>. Roll a d20. This effect lasts for <font color='#ff0808'><b>90&nbsp;seconds</b></font> if the performance is completed." +
                                "<ul><li><font color='#ffffff'><b>1</b></font> | You scream, but nothing happens.</li><br>" +
                                "<li><font color='#ffffff'><b>2-10</b></font> | Skill Checks give +1% progress.</li><br>" +
                                "<li><font color='#ffffff'><b>11-19</b></font> | Skill Checks give +2% progress.</li><br>" +
                                "<li><font color='#ffffff'><b>20</b></font> | Skill Checks give +3% progress.</li></ul>" +
                                "When the ability is canceled or the performance completes, it goes on cooldown for " +
                                "<font color='#ffff1a'><b>110</font>/<font color='#199b1e'>100</font>/<font color='#ac3ee3'>90</b></font> seconds.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Listen closely! I'm about to save your life!?&quot; —&#8288;Aestri</i></font>",
                        R.drawable.survivor_bardic_inspiration, Arrays.asList("Aestri", "Healing", "Repairing", "Scream"),139),
                new PerkItem("<font color='#ffffff'><b>BETTER THAN NEW</b></font>",
                        "<font color='#aaa9a9'>You are an expert in combat medicine. Patients leave your care reinvigorated." +
                                "<ul><li>Upon completing a healing action on another Survivor, the targeted Survivor gets a " +
                                "<font color='#ffff1a'><b>12</font>/<font color='#199b1e'>14</font>/<font color='#ac3ee3'>16</b></font> % speed boost to healing, opening chests, cleansing and blessing Totems.</li></ul>" +
                                "Survivors keep the bonus until they lose a health state.",
                        R.drawable.survivor_better_than_new, Arrays.asList("Rebecca", "Healing", "Totem"),111),
                new PerkItem("<font color='#ffffff'><b>BETTER TOGETHER</b></font>",
                        "<font color='#aaa9a9'>You seek justice and uncover the truth no matter what obstacle stands in your way." +
                                "<ul><li>The aura of the generator you are currently repairing is revealed to all other Survivors located within <font color='#ff8800'><b>32&nbsp;meters</b></font>.</li><br>" +
                                "<li>If The Killer downs a Survivor while you are repairing a generator, you see the aura of all other Survivors for " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>9</font>/<font color='#ac3ee3'>10</b></font> seconds.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Let's burn that lab to the ground.&quot; —&#8288;Nancy Wheeler</i></font>",
                        R.drawable.survivor_better_together, Arrays.asList("Nancy","Situational Awareness", "Aura"),66),
                new PerkItem("<font color='#ffffff'><b>BITE THE BULLET</b></font>",
                        "<font color='#aaa9a9'>Pain hurts you as much as anyone, but you'd prefer others don't know that." +
                                "<ul><li>When healing, you and the Survivor you're healing make no noise, including grunts of pain.</li><br>" +
                                "<li>There is no noise notification on failed healing Skill Checks and healing regresses by only " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>2</font>/<font color='#ac3ee3'>1</b></font> %</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I can do this.&quot; —&#8288;Leon S. Kennedy</i></font>",
                        R.drawable.survivor_bite_the_bullet, Arrays.asList("Leon", "Healing"),93),
                new PerkItem("<font color='#ffffff'><b>BLAST MINE</b></font>",
                        "<font color='#aaa9a9'>When direct combat isn't an option, you still find ways to strike back.<br><br>" +
                                "<i>Blast Mine</i> activates after completing a total of <font color='#ff8800'><b>40%</b></font> worth of repair progress on generators.<br><br>" +
                                "When standing next to a generator, press the <i>Active Ability Button 2</i> to install a Blast Mine which stays active for " +
                                "<font color='#ffff1a'><b>100</font>/<font color='#199b1e'>110</font>/<font color='#ac3ee3'>120</b></font> seconds." +
                                "<ul><li>Affected generators will be revealed to all Survivors by a yellow aura. Only one <i>Blast Mine</i> can be active on a generator.</li><br>" +
                                "<li>When the Killer damages the generator, the <i>Blast Mine</i> explodes, stunning them and blinding anyone nearby.</li></ul>" +
                                "<i>Blast Mine</i> deactivates when the generator is damaged by the Killer or when the timer expires.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;You want S.T.A.R.S.? I'll give you S.T.A.R.S.!&quot; —&#8288;Jill Valentine</i></font>",
                        R.drawable.survivor_blast_mine, Arrays.asList("Jill", "Aura", "Stun"),92),
                new PerkItem("<font color='#ffffff'><b>BLOOD PACT</b></font>",
                        "<font color='#aaa9a9'>It's as if a latent part of yourself has awakened. You feel like you can reach out beyond yourself for assistance." +
                                "<ul><li>When you or the Obsession are injured, you both see each other's auras.</li><br>" +
                                "<li>After completing a healing action on the Obsession, or having the Obsession complete a healing action on you, you both gain a " +
                                "<font color='#ffff1a'><b>5</font>/<font color='#199b1e'>6</font>/<font color='#ac3ee3'>7</b></font> % <font color='#ffffff'><b>Haste</b></font> status effect until no longer within " +
                                "<font color='#ff8800'><b>16 meters</b></font> of each other.</li></ul>" +
                                "Reduces the odds of being the Obsession.<br><br>" +
                                "If you are the Obsession, this perk deactivates.<br><br>" + haste + "<br><br>" + obsessed,
                        R.drawable.survivor_blood_pact, Arrays.asList("Cheryl", "Aura", "Haste", "Obsession"),78),
                new PerkItem("<font color='#ffffff'><b>BLOOD RUSH</b></font>",
                        "<font color='#aaa9a9'>Your mind and body are honed for great feats, allowing you to push through with extra effort when necessary.<br><br>" +
                                "After being unhooked, <i>Blood Rush</i> activates for the next " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> seconds." +
                                "<ul><li>While suffering from the <font color='#ffffff'><b>Exhausted</b></font> status effect, press the <i>Active Ability Button 1</i> to recover from <font color='#ffffff'><b>Exhausted</b></font> instantly.</li></ul>" +
                                "This perk deactivates when it is used or when performing a Conspicuous Action.<br><br>" +
                                "<i>Blood Rush</i> is disabled once the Exit Gates are powered.</font><br><br>" + exhaustion + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Just gotta… push through.&quot; —&#8288;Renato Lyra</i></font>",
                        R.drawable.survivor_blood_rush, Arrays.asList("Renato", "Exhaustion", "Hook"),121),
                new PerkItem("<font color='#ffffff'><b>BOIL OVER</b></font>",
                        "<font color='#aaa9a9'><ul><li>You are a battler and do everything to escape a foe's grasp. Your struggling effects on The Killer are increased by " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>70</font>/<font color='#ac3ee3'>80</b></font> %.</li><br>" +
                                "<li>You gain <font color='#ff8800'><b>33%</b></font> of current wiggling progress when the Killer drops from great heights.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Buck and Wild,<br>" +
                                "Swing to be free,<br>" +
                                "Your hands just can't keep ahold of me.&quot;<br>" +
                                "—&#8288;Kate Denson's &quot;Boil Over&quot;",
                        R.drawable.survivor_boil_over, Arrays.asList("Kate", "Wiggle"),51),
                new PerkItem("<font color='#ffffff'><b>BOND</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>Allies' auras are revealed to you when they are within a " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>28</font>/<font color='#ac3ee3'>36</b></font> meter range.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;We have to work as a team, I need you to survive so that I can survive!&quot; —&#8288;Dwight</i></font>",
                        R.drawable.survivor_bond, Arrays.asList("Dwight", "Aura"),15),
                new PerkItem("<font color='#ffffff'><b>BOON: CIRCLE OF HEALING</b></font>",
                        "<font color='#aaa9a9'>A boon that offers comfort amidst the terror.<br><br>" + boon +
                                "<ul><li>Any Survivors within the Boon Totem's range gain a " +
                                "<font color='#ffff1a'><b>50</font>/<font color='#199b1e'>75</font>/<font color='#ac3ee3'>100</b></font> % healing speed bonus to healing others. Med-Kits give no bonus to healing in the Boon Totem's range.</li><br>" +
                                "<li>Injured Survivors have their auras revealed to all other Survivors when inside the Boon Totem's range.</li></ul>" +
                                "You can only bless one Totem at a time.<br><br>All equipped boon perks are active on your Boon Totem.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Try this, it's better than anything you'll find in a pharmacy.&quot; —&#8288;Mikaela Reid</i></font>",
                        R.drawable.survivor_boon_circle_of_healing, Arrays.asList("Mikaela", "Aura", "Boon", "Healing"),97),
                new PerkItem("<font color='#ffffff'><b>BOON: DARK THEORY</b></font>",
                        "<font color='#aaa9a9'>Your obsessive study of the paranormal has given you unprecedented knowledge of other realms and planes of existence.<br><br>" + boon +
                                "<ul><li>Any Survivors within the Boon Totem's range gain a <font color='#ff8800'><b>2%</b></font> <font color='#ffffff'><b>Haste</b></font> status effect.</li></ul>" +
                                "This effect lingers for <font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> seconds after leaving the Boon Totem's range.<br><br>" +
                                "You can only bless one Totem at a time.<br><br>All equipped boon perks are active on your Boon Totem.<br><br></font>" + haste,
                        R.drawable.survivor_boon_dark_theory, Arrays.asList("Yoichi", "Boon", "Haste"),104),
                new PerkItem("<font color='#ffffff'><b>BOON: EXPONENTIAL</b></font>",
                        "<font color='#aaa9a9'>When it seems like your number is up, you consider ways to recalculate the odds.<br><br>" + boon +
                                "<ul><li>All Survivors within the Boon Totem's range recover " +
                                "<font color='#ffff1a'><b>90</font>/<font color='#199b1e'>95</font>/<font color='#ac3ee3'>100</b></font> % faster and can completely recover from the dying state.</li></ul>" +
                                "You can only bless one Totem at a time.<br><br>All equipped boon perks are active on your Boon Totem.<br><br></font>" +
                                "<font color='#eeddbe'><i>&quot;It's not our time to die... probably.&quot; —&#8288;Jonah Vasquez</i></font>",
                        R.drawable.survivor_boon_exponential, Arrays.asList("Jonah", "Boon", "Healing", "Slug"),101),
                new PerkItem("<font color='#ffffff'><b>BOON: ILLUMINATION</b></font>",
                        "<font color='#aaa9a9'>Your keen insight is something best shared with others.<br><br>" + boon +
                                "<ul><li>Survivors inside your Boon Totem's range see the aura of all chests and all generators in blue.</li><br>" +
                                "<li>If you have a lit Boon Totem, you cleanse or bless Totems " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> % faster.</li></ul>" +
                                "You can only bless one Totem at a time.<br><br>All equipped boon perks are active on your Boon Totem.<br><br></font>" +
                                "<font color='#eeddbe'><i>&quot;A shift in reality. Heavy with hidden meanings.&quot; —&#8288;Return</i></font>",
                        R.drawable.survivor_boon_illumination, Arrays.asList("Alan", "Aura", "Boon", "Totem"),133),
                new PerkItem("<font color='#ffffff'><b>BOON: SHADOW STEP</b></font>",
                        "<font color='#aaa9a9'>A boon that conceals the truth.<br><br>" + boon +
                                "<ul><li>Any Survivors within the Boon Totem's range will have their scratch marks and auras hidden to the Killer.</li></ul>" +
                                "This effect lingers for <font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> seconds after leaving the Boon Totem's range.<br><br>" +
                                "You can only bless one Totem at a time.<br><br>All equipped boon perks are active on your Boon Totem.<br><br></font>" +
                                "<font color='#eeddbe'><i>&quot;Stick to the shadows and cover your tracks.&quot; —&#8288;Mikaela Reid</i></font>",
                        R.drawable.survivor_boon_shadow_step, Arrays.asList("Mikaela", "Boon", "Chase"),98),
                new PerkItem("<font color='#ffffff'><b>BORROWED TIME</b></font>",
                        "<font color='#aaa9a9'>You are fueled by unexpected energy when saving an ally from a hook.<br><br>" +
                                "Survivors you unhook:" +
                                "<ul><li>Keep their <font color='#ffffff'><b>Endurance</b></font> status effect for an extra " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> seconds.</li><br>" +
                                "<li>Keep their movement speed bonus for an extra <font color='#ff8800'><b>10 seconds</b></font>.</li></ul>" + endurance + "<br><br>" + deep_wound + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Probably stings like hell, but it ain't gonna kill ya. Up and at 'em soldier. Time to move!&quot; —&#8288;Bill Overbeck</i></font>",
                        R.drawable.survivor_borrowed_time, Arrays.asList("Bill", "Endurance", "Haste", "Hook"),36),
                new PerkItem("<font color='#ffffff'><b>BOTANY KNOWLEDGE</b></font>",
                        "<font color='#aaa9a9'>You transform plants found around the campfire into tinctures that slow down bleeding." +
                                "<ul><li>Healing speed is increased by " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>50</b></font>&nbsp;%.</li><br>" +
                                "<li>Healing item efficiency is reduced by <font color='#ff8800'><b>20%</b></font>.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Basic botany knowledge could save your life someday.&quot;</i></font>",
                        R.drawable.survivor_botany_knowledge, Arrays.asList("Claudette", "Healing"),21),
                new PerkItem("<font color='#ffffff'><b>BREAKDOWN</b></font>",
                        "<font color='#aaa9a9'><ul><li>Any time you are removed from a hook (escaped or saved), the hook breaks and the Killer's aura is shown to you for " +
                                "<font color='#ffff1a'><b>4</font>/<font color='#199b1e'>5</font>/<font color='#ac3ee3'>6</b></font> seconds.</li><br>" +
                                "<li>A hook broken by this perk takes <font color='#ff8800'><b>180 seconds</b></font> to respawn.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Charge from the Belly of the Beast.&quot;<br>" +
                                "Here's a sketch/painting on a piece of wood I saw by the side of the road. I felt like it got a story to tell. And it didn't waste its second chance. —&#8288;Jeff, ink and oil wash on slice of wood, 12x16</i></font>",
                        R.drawable.survivor_breakdown, Arrays.asList("Jeff", "Hook", "Killer Aura"),58),
                new PerkItem("<font color='#ffffff'><b>BREAKOUT</b></font>",
                        "<font color='#aaa9a9'>You kick into high gear when someone's in trouble, inspiring them to overcome any obstacle." +
                                "<ul><li>When within <font color='#ffff1a'><b>5 meters</b></font> of a carried Survivor, you gain the <font color='#ffffff'><b>Haste</b></font> status effect, moving at " +
                                "<font color='#ffff1a'><b>5</font>/<font color='#199b1e'>6</font>/<font color='#ac3ee3'>7</b></font> % increased speed.</li><br>" +
                                "<li>The carried Survivor's wiggle speed is increased by <font color='#ff8800'><b>25%</b></font>.</li></ul>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Come, we're going to rip our way out of this.&quot; —&#8288;Yui Kimura</i></font>",
                        R.drawable.survivor_breakout, Arrays.asList("Yui", "Haste", "Wiggle"),73),
                new PerkItem("<font color='#ffffff'><b>BUCKLE UP</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability.<br><br>" +
                                "While healing a Survivor in the dying state:" +
                                "<ul><li>You both can see the Killer's aura.</li></ul>" +
                                "When completing healing a Survivor from the dying state to injured:" +
                                "<ul><li>The healed Survivor gains <font color='#ff8800'><b>50%</b></font> <font color='#ffffff'><b>Haste</b></font> for " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> seconds and leaves no scratch marks during this time.</li></ul></font>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Ghost beaters never leave a man behind.&quot; —&#8288;Ash Williams</i></font>",
                        R.drawable.survivor_buckle_up, Arrays.asList("Ash", "Haste", "Healing", "Killer Aura", "Slug"),63),
                new PerkItem("<font color='#ffffff'><b>BUILT TO LAST</b></font>",
                        "<font color='#aaa9a9'>You know how to get the most out of your tools." +
                                "<ul><li>After hiding inside a locker for " +
                                "<font color='#ffff1a'><b>14</font>/<font color='#199b1e'>13</font>/<font color='#ac3ee3'>12</b></font> seconds with a depleted item in hand, <font color='#ff8800'><b>99%</b></font> of its charges are refilled.</li><br>" +
                                "<li>Each use of <i>Built to Last</i> reduces the amounts of charges refilled by <font color='#ff0808'><b>33%</b></font>.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Architecture is the soul of civilization.&quot; —&#8288;Felix Richter</i></font>",
                        R.drawable.survivor_built_to_last, Arrays.asList("Felix", "Item"),81),
                new PerkItem("<font color='#ffffff'><b>CALM SPIRIT</b></font>",
                        "<font color='#aaa9a9'>Animals seem to trust you as they often stay calm in your presence." +
                                "<ul><li>Reduces chances of alerting woodland creatures by <font color='#ff8800'><b>100%</b></font>.</li><br>" +
                                "<li>Allows you to overcome the urge to scream.</li><br>" +
                                "<li>Allows you to open chests and cleanse/bless Totems silently, but at " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>35</font>/<font color='#ac3ee3'>30</b></font>&nbsp;% reduced speed.</li></ul></font>",
                        R.drawable.survivor_calm_spirit, Arrays.asList("Jake", "Chase", "Totem"),24),
                new PerkItem("<font color='#ffffff'><b>CAMARADERIE</b></font>",
                        "<font color='#aaa9a9'>Life has taught you the importance of friendship which has given you strength.<br><br>" +
                                "While you are on the hook in the struggle phase, <i>Camaraderie</i> activates." +
                                "<ul><li>If another Survivor is within <font color='#ff8800'><b>16 meters</b></font> of you while <i>Camaraderie</i> is activated, the hook timer is paused for " +
                                "<font color='#ffff1a'><b>26</font>/<font color='#199b1e'>30</font>/<font color='#ac3ee3'>34</b></font> seconds.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;So, remember once you get in there... pretend like you don't care. There you go, you're learning my friend. You're learning.&quot; —&#8288;Steve Harrington</i></font>",
                        R.drawable.survivor_camaraderie, Arrays.asList("Steve", "Kinship", "Hook"),70),
                new PerkItem("<font color='#ffffff'><b>CHAMPION OF LIGHT</b></font>",
                        "<font color='#aaa9a9'>The glow of the flashlight looks a little different, feels a little warmer." +
                                "<ul><li>When you are shining a Flashlight, you have <font color='#ff8800'><b>50%</b></font> <font color='#ffffff'><b>Haste</b></font> for <font color='#ff0808'><b>6&nbsp;seconds</b></font>.</li></ul>" +
                                "This effect cannot stack with itself.<br><br>" +
                                "Then, this perk goes on cooldown for <font color='#ffff1a'><b>80</font>/<font color='#199b1e'>70</font>/<font color='#ac3ee3'>60</b></font> seconds.<br><br>" + haste + "<br><br>" + hindered + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I squeezed the flashlight like my life depended on it, willing it to stop coming any closer.&quot; —&#8288;Departure</i></font>",
                        R.drawable.survivor_champion_of_light, Arrays.asList("Alan", "Chase", "Haste", "Hindered"),132),
                new PerkItem("<font color='#ffffff'><b>CHEMICAL TRAP</b></font>",
                        "<font color='#aaa9a9'>In the Fog, an officer must adapt to the materials at hand.<br><br>" +
                                "<i>Chemical Trap</i> activates after completing a total of <font color='#ffff1a'><b>20%</b></font> worth of progress on generators." +
                                "<ul><li>While standing next to a dropped pallet, press the <i>Active Ability Button 2</i> to install a Trap, which stays active for " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> seconds.</li><br>" +
                                "<li>Affected pallets will be revealed to all Survivors by a yellow aura. Only one <i>Chemical Trap</i> can be active on a pallet.</li><br>" +
                                "<li>When the Killer performs the break action on the pallet, the <i>Chemical Trap</i> explodes, and they are slowed by <font color='#ff8800'><b>50%</b></font> for <font color='#ff0808'><b>4 seconds</b></font>.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;How do we kill it, Ash?&quot; —&#8288;Ellen Ripley</i></font>",
                        R.drawable.survivor_chemical_trap, Arrays.asList("Ellen", "Aura", "Chase", "Hindered", "Pallet"),130),
                new PerkItem("<font color='#ffffff'><b>CLAIRVOYANCE</b></font>",
                        "<font color='#aaa9a9'>There is an intrinsic energy in you that sees beyond your vision.<br><br>" +
                                "<i>Clairvoyance</i> activates whenever you cleanse or bless a Totem.<br><br>" +
                                "When empty-handed, hold the Ability Button to unlock your full aura-reading potential." +
                                "<ul><li>For up to <font color='#ffff1a'><b>8</font>/<font color='#199b1e'>9</font>/<font color='#ac3ee3'>10</b></font> seconds, you see the auras of exit gate switches, generators, hooks, chests and the Hatch within a " +
                                "<font color='#ff8800'><b>64 meter</b></font> range.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Does anyone else see that? Just me?&quot; —&#8288;Mikaela Reid</i></font>",
                        R.drawable.survivor_clairvoyance, Arrays.asList("Mikaela", "Aura", "Totem"),96),
                new PerkItem("<font color='#ffffff'><b>CLEAN BREAK</b></font>",
                        "<font color='#aaa9a9'>At the end of the day, everyone has to look out for themselves." +
                                "<ul><li>After you finish healing another Survivor, while being healed by another Survivor, press the <i>Ability Button 1</i> to gain the <font color='#ffffff'><b>Broken</b></font> status effect.</li><br>" +
                                "<li>After <font color='#ffff1a'><b>80</font>/<font color='#199b1e'>70</font>/<font color='#ac3ee3'>60</b></font> seconds, you become healthy.</li></ul>" +
                                "<i>This perk does not activate if you are already <font color='#ffffff'><b>Broken</b></font>. The effect is canceled if you go into the dying state</i>.<br><br>" + broken + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I'll be fine! Don't stick your neck out for me.&quot; —&#8288;Taurie Cain</i></font>",
                        R.drawable.survivor_clean_break, Arrays.asList("Taurie", "Broken", "Healing"),148),
                new PerkItem("<font color='#ffffff'><b>CORRECTIVE ACTION</b></font>",
                        "<font color='#aaa9a9'>You quickly analyze problems and correct other's work when they make a mistake.<br><br>" +
                                "You start the trial with <font color='#ffff1a'><b>1</font>/<font color='#199b1e'>2</font>/<font color='#ac3ee3'>3</b></font> token(s) and gain a token, up to a maximum of <font color='#ff8800'><b>5</b></font>, for every great Skill Check." +
                                "<ul><li>When a Survivor fails a Normal Skill, 1 token is consumed and their failed Skill Check becomes a good Skill Check.</li><br>" +
                                "<li>Additionally, their aura is revealed to you for <font color='#ff0808'><b>6&nbsp;seconds</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Can't hurt to have another set of eyes on the problem.&quot; —&#8288;Jonah Vasquez</i></font>",
                        R.drawable.survivor_corrective_action, Arrays.asList("Jonah", "Aura", "Healing", "Repairing"),100),
                new PerkItem("<font color='#ffffff'><b>COUNTERFORCE</b></font>",
                        "<font color='#aaa9a9'>You know how to withstand an enemy stronger than you, and it starts with hunting down and knocking out their support." +
                                "<ul><li>You cleanse Totems <font color='#ff8800'><b>20%</b></font> faster.</li><br>" +
                                "<li>After cleansing a Totem, you see the aura of the furthest Totem from you for " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> seconds and you gain an additional <font color='#ff0808'><b>20%</b></font> stackable speed bonus to cleansing Totems for the remainder of the trial.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I don't mind a little detective work.&quot; —&#8288;Jill Valentine</i></font>",
                        R.drawable.survivor_counterforce, Arrays.asList("Jill", "Aura", "Totem"),90),
                new PerkItem("<font color='#ffffff'><b>CUT LOOSE</b></font>",
                        "<font color='#aaa9a9'>You get in enough trouble. You know how to get out of it.<br><br>" +
                                "After performing a rushed vault in a chase, this perk activates." +
                                "<ul><li>While this perk is active, your rushed vaults are silent for up to " +
                                "<font color='#ffff1a'><b>4</font>/<font color='#199b1e'>5</font>/<font color='#ac3ee3'>6</b></font> seconds and successfully performing a rushed vault during that time resets the timer.</li></ul>" +
                                "This perk goes on cooldown for <font color='#ff8800'><b>45 seconds</b></font>.<br><br></font>" +
                                "<font color='#eeddbe'><i>&quot;I know how we can get out of here. Quick, this way.&quot; —&#8288;Thalita Lyra</i></font>",
                        R.drawable.survivor_cut_loose, Arrays.asList("Thalita", "Chase"),117),
                new PerkItem("<font color='#ffffff'><b>DANCE WITH ME</b></font>",
                        "<font color='#aaa9a9'><ul><li>When performing a rushed vault or leaving a locker in a sprint, you leave no scratch marks for <font color='#ff8800'><b>3 seconds</b></font>.</li></ul>" +
                                "<i>Dance With Me</i> has a cooldown of " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>20</b></font> seconds.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Another show's off and runnin',<br>" +
                                "Dance with me, cuz there's a storm a comin',<br>" +
                                "Follow my boots, try to keep up,<br>" +
                                "Dance with me, until sun up.&quot;<br>" +
                                "—&#8288;Kate Denson's &quot;Dance With Me&quot;",
                        R.drawable.survivor_dance_with_me, Arrays.asList("Kate", "Chase"),52),
                new PerkItem("<font color='#ffffff'><b>DARK SENSE</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>While <i>Dark Sense</i> is active, the Killer entering a <font color='#ff8800'><b>24 meter</b></font> radius around you reveals their aura for " +
                                "<font color='#ffff1a'><b>5</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>10</b></font> seconds.</li></ul>" +
                                "Once the aura's duration expires, <i>Dark Sense</i> deactivates.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Take it from an old-timer: Slow down, don't rush and try not to worry so much! The best way to beat him is to know how he thinks.&quot; —&#8288;Lost Tapes: Murf</i></font>",
                        R.drawable.survivor_dark_sense, Arrays.asList("Default", "Killer Aura"),1),
                new PerkItem("<font color='#ffffff'><b>DEAD HARD</b></font>",
                        "<font color='#aaa9a9'>You can take a beating.<br><br>" +
                                "<i>Dead Hard</i> activates after you are unhooked or unhook yourself.<br><br>" +
                                "When injured, tap into your adrenaline bank to avoid incoming damage." +
                                "<ul><li>Press the <i>Active Ability Button 1</i> while running to gain the <font color='#ffffff'><b>Endurance</b></font> status effect for the next <font color='#ff8800'><b>0.5 seconds</b></font>.</li></ul>" +
                                "Causes the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.<br><br>" +
                                "<i>Dead Hard</i> then deactivates.<br><br>" + endurance + "<br><br>" + deep_wound + "<br><br>" + exhaustion + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;We were walkin' through t'ginnel one night when a beer bottle flew past me, then another, and another. I thought to myself, “Gonna 'ave some fun ‘ere lads, let's get stuck in!” It were a right dust up, I swear down!&quot; —&#8288;David King</i></font>",
                        R.drawable.survivor_dead_hard, Arrays.asList("David", "Endurance", "Exhaustion", "Hook", "Injured"),42),
                new PerkItem("<font color='#ffffff'><b>DEADLINE</b></font>",
                        "<font color='#aaa9a9'>Desperation creeps in, and you push yourself to work harder." +
                                "This perk activates when you are injured." +
                                "<ul><li>Skill Checks appear " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> % more frequently when repairing or healing and appear in random places.</li><br>" +
                                "<li>The penalty for missing skill checks is reduced by <font color='#ff8800'><b>50%</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;The night had been one desperate situation after another.&quot; —&#8288;Departure</i></font>",
                        R.drawable.survivor_deadline, Arrays.asList("Alan", "Healing", "Repairing"),134),
                new PerkItem("<font color='#ffffff'><b>DECEPTION</b></font>",
                        "<font color='#aaa9a9'>Your adventurous lifestyle requires moments of crafty misdirection." +
                                "<ul><li>Interacting with a locker while sprinting will trigger a loud noise notification at your location and cause you to leave no scratch marks for <font color='#ff8800'><b>3 seconds</b></font>.</li></ul>" +
                                "You no longer enter lockers while sprinting and while this perk is active.<br><br>" +
                                "<i>Deception</i> can only be triggered once every " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>20</b></font> seconds.</font>",
                        R.drawable.survivor_deception, Arrays.asList("Élodie", "Chase"),85),
                new PerkItem("<font color='#ffffff'><b>DECISIVE STRIKE</b></font>",
                        "<font color='#aaa9a9'>Stab at your aggressor in an attempt to escape.<br><br>" +
                                "After being unhooked or unhooking yourself, <i>Decisive Strike</i> activates for " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> seconds." +
                                "<ul><li>While active, complete a Skill Check when grabbed by the Killer to escape, stunning them for <font color='#ff8800'><b>4 seconds</b></font>.</li></ul>" +
                                "Succeeding or failing the Skill Check disables <i>Decisive Strike</i>.<br><br>" +
                                "You become the Obsession after stunning the Killer.<br><br>" +
                                "The perk and its effects are disabled if the exit gates are powered.<br><br>" +
                                "Increases your chance to be the Obsession.<br><br>" +
                                "Taking any Conspicuous Action will deactivate <i>Decisive Strike</i>.<br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;There is nothing to be scared of.&quot; —&#8288;Laurie Strode</i></font>",
                        R.drawable.survivor_decisive_strike, Arrays.asList("Laurie", "Hook", "Obsession", "Stun"),30),
                new PerkItem("<font color='#ffffff'><b>DÉJÀ VU</b></font>",
                        "<font color='#aaa9a9'><ul><li>The auras of <font color='#ff8800'><b>3&nbsp;generators</b></font> which are in close proximity to one another are revealed to you.</li><br>" +
                                "<li>Gain a <font color='#ffff1a'><b>4</font>/<font color='#199b1e'>5</font>/<font color='#ac3ee3'>6</b></font> % repair speed bonus on the revealed generators.</li></ul></font>",
                        R.drawable.survivor_deja_vu, Arrays.asList("Default", "Aura", "Repairing"),2),
                new PerkItem("<font color='#ffffff'><b>DELIVERANCE</b></font>",
                        "<font color='#aaa9a9'>After performing a safe hook rescue on another Survivor, <i>Deliverance</i> activates." +
                                "<ul><li>You now have a <font color='#ff8800'><b>100%</b></font> chance of unhooking yourself during the escape attempt.</li></ul>" +
                                "A successful <i>Deliverance</i> from the hook triggers the <font color='#ffffff'><b>Broken</b></font> status effect for " +
                                "<font color='#ffff1a'><b>100</font>/<font color='#199b1e'>80</font>/<font color='#ac3ee3'>60</b></font> seconds.<br><br>" + broken + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I was raised by a strict man who taught me how to make the best of a bad situation.&quot; —&#8288;Adam Francis</i></font>",
                        R.drawable.survivor_deliverance, Arrays.asList("Adam", "Broken", "Hook"),55),
                new PerkItem("<font color='#ffffff'><b>DESPERATE MEASURES</b></font>",
                        "<font color='#aaa9a9'>You refuse to fail, even during your darkest hour." +
                                "<ul><li>For each injured, hooked, or dying Survivor, increase the speed of your healing and unhook actions by " +
                                "<font color='#ffff1a'><b>10</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>14</b></font> %.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;When they come with a wrecking ball, build stronger walls.&quot; —&#8288;Felix Richter</i></font>",
                        R.drawable.survivor_desperate_measures, Arrays.asList("Felix", "Healing", "Hook", "Slug"),82),
                new PerkItem("<font color='#ffffff'><b>DETECTIVE'S HUNCH</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>When a generator is completed, the auras of generators, chests and Totems within " +
                                "<font color='#ffff1a'><b>32</font>/<font color='#199b1e'>48</font>/<font color='#ac3ee3'>64</b></font> meters are revealed to you for " +
                                "<font color='#ff8800'><b>10&nbsp;seconds</b></font>.</li><br>" +
                                "<li>If you are holding a Map that can track objectives, generators, chests and Totems revealed by <i>Detective's Hunch</i> are added to the Map.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Are you able to tell us where you were last night?&quot; —&#8288;Detective David Tapp</i></font>",
                        R.drawable.survivor_detectives_hunch, Arrays.asList("Detective Tapp", "Aura"),48),
                new PerkItem("<font color='#ffffff'><b>DISTORTION</b></font>",
                        "<font color='#aaa9a9'>When your aura would be shown to the Killer, the perk activates.<br><br>" +
                                "<i>Distortion</i> starts with <font color='#ffff1a'><b>1&nbsp;token</b></font>." +
                                "<ul><li>When your aura would be read, <i>Distortion</i> activates and consumes a token.</li><br>" +
                                "<li>For the next <font color='#ffff1a'><b>8</font>/<font color='#199b1e'>10</font>/<font color='#ac3ee3'>12</b></font> seconds, your aura and scratch marks will not be shown to The Killer.</li></ul>" +
                                "For each <font color='#ff8800'><b>15&nbsp;seconds</b></font> spent in chase, regain <font color='#ff0808'><b>1&nbsp;token</b></font>, up to <font color='#ff0808'><b>2</b></font>.<br><br>" +
                                "This effect cannot trigger while in the dying state.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Death Fooled by the Cloak of Falcon Feathers.&quot;<br>" +
                                "Sketch inspired by a few sleepless nights during winter. Exploration of Norse mythology: bravery can conceal your flaws, even when you are at your most vulnerable. —&#8288;Jeff, pencil on toned paper, 12x12</i></font>",
                        R.drawable.survivor_distortion, Arrays.asList("Jeff", "Aura", "Chase"),59),
                new PerkItem("<font color='#ffffff'><b>DIVERSION</b></font>",
                        "<font color='#aaa9a9'>Being within the Killer's Terror Radius while not in a chase for " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>20</b></font> seconds activates <i>Diversion</i>." +
                                "<ul><li>Once <i>Diversion</i> is activated, press the <i>Active Ability Button 1</i> while crouched and motionless to throw a pebble, which creates a distraction for The Killer at a distance of <font color='#ff8800'><b>20&nbsp;meters</b></font>.</li></ul>" +
                                "The perk timer resets once the ability has been activated.<br><br>" +
                                "The distraction consists of:" +
                                "<ul><li>A loud noise notification</li><br>" +
                                "<li>Scratch marks</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;There's what is easy and then there's what is right. If you confuse the two, there's no telling what you become.&quot; —&#8288;Adam Francis</i></font>",
                        R.drawable.survivor_diversion, Arrays.asList("Adam", "Chase"),56),
                new PerkItem("<font color='#ffffff'><b>DRAMATURGY</b></font>",
                        "<font color='#aaa9a9'>When people bring you on to their project, they do so because of the unexpected magic you bring to your performance.<br><br>" +
                                "<i>Dramaturgy</i> activates while you are healthy.<br><br>" +
                                "While running, press the <i>Active Ability Button 2</i> to run with knees high for 0.5 seconds and then gain <font color='#ffff1a'><b>25%</b></font> <font color='#ffffff'><b>Haste</b></font> for <font color='#ff8800'><b>2&nbsp;seconds</b></font>, followed by an unknown effect." +
                                "<ul><li>Become <font color='#ffffff'><b>Exposed</b></font> for <font color='#ff0808'><b>12&nbsp;seconds</b></font>.</li><br>" +
                                "<li>Gain <font color='#ffff1a'><b>25%</b></font> <font color='#ffffff'><b>Haste</b></font> for <font color='#ff0808'><b>2&nbsp;seconds</b></font>.</li><br>" +
                                "<li>Scream, but nothing happens.</li><br>" +
                                "<li>Gain a random rare item, with random add-ons, and drop any held item.</li></ul>" +
                                "<i>The same effect cannot happen twice in a row</i>.<br><br>" +
                                "<i>Dramaturgy</i> causes <font color='#ffffff'><b>Exhausted</b></font> for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds. Can't be used while <font color='#ffffff'><b>Exhausted</b></font>.</font><br><br>" + exhaustion + "<br><br>" + exposed + "<br><br>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Take the part. It's a good movie, he says. What's the worst that can happen?&quot; —&#8288;Nicolas Cage</i></font>",
                        R.drawable.survivor_dramaturgy, Arrays.asList("Nicolas", "Exhaustion", "Exposed", "Haste", "Healthy", "Item", "Scream"),126),
                new PerkItem("<font color='#ffffff'><b>EMPATHIC CONNECTION</b></font>",
                        "<font color='#aaa9a9'>Your presence psychically projects itself to those in danger." +
                                "<ul><li>Whenever another Survivor is injured, they can see your aura within a range of " +
                                "<font color='#ffff1a'><b>32</font>/<font color='#199b1e'>64</font>/<font color='#ac3ee3'>96</b></font> meters.</li><br>" +
                                "<li>You heal other Survivors <font color='#ff8800'><b>30%</b></font> faster.</li></ul></font>",
                        R.drawable.survivor_empathic_connection, Arrays.asList("Nicolas", "Aura", "Healing"),103),
                new PerkItem("<font color='#ffffff'><b>EMPATHY</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>Dying or injured allies' auras are revealed to you when within a " +
                                "<font color='#ffff1a'><b>64</font>/<font color='#199b1e'>96</font>/<font color='#ac3ee3'>128</b></font> meter range.</li></ul>" +
                                "<i>Empathy</i> does not reveal auras of allies when they are in direct contact with the Killer.</font>",
                        R.drawable.survivor_empathy, Arrays.asList("Claudette", "Aura"),22),
                new PerkItem("<font color='#ffffff'><b>EXULTATION</b></font>",
                        "<font color='#aaa9a9'>Fortune favors the bold, even in the darkest corners of existence." +
                                "<ul><li>Stunning the Killer with a pallet upgrades your held item rarity to the next tier, then recharges <font color='#ff8800'><b>25%</b></font> of the item's maximum charges.</li></ul>" +
                                "This perk has a <font color='#ffff1a'><b>40</font>/<font color='#199b1e'>35</font>/<font color='#ac3ee3'>30</b></font> second cooldown.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;You will not take me this day!&quot; —&#8288;Trevor</i></font>",
                        R.drawable.survivor_exultation, Arrays.asList("Trevor", "Item", "Stun"),145),
                new PerkItem("<font color='#ffffff'><b>EYES OF BELMONT</b></font>",
                        "<font color='#aaa9a9'>A history of vampire-hunting imbues the bloodline with certain abilities." +
                                "<ul><li>When a generator is completed, the aura of the Killer is revealed to you for " +
                                "<font color='#ffff1a'><b>1</font>/<font color='#199b1e'>2</font>/<font color='#ac3ee3'>3</b></font> seconds.</li><br>" +
                                "<li>Whenever a Killer's aura is revealed for a specified amount of time, that time is increased by <font color='#ff8800'><b>2&nbsp;seconds</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Ha! Your secret has been revealed!&quot; —&#8288;Trevor</i></font>",
                        R.drawable.survivor_eyes_of_belmont, Arrays.asList("Trevor", "Killer Aura"),144),
                new PerkItem("<font color='#ffffff'><b>FAST TRACK</b></font>",
                        "<font color='#aaa9a9'>Sometimes the sacrifice of others is necessary to get ahead.<br><br>" +
                                "Whenever another Survivor is hooked, you gain " +
                                "<font color='#ffff1a'><b>1</font>/<font color='#199b1e'>2</font>/<font color='#ac3ee3'>3</b></font> tokens.You consume all tokens after a great Skill Check on a generator." +
                                "<ul><li>Each token consumed grants a <font color='#ff8800'><b>1%</b></font> bonus progression for great Skill Checks when repairing generators.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;The weak are sacrificed first. It's nature, it's business... it's the truth most refuse to face.&quot; —&#8288;Yun-Jin</i></font>",
                        R.drawable.survivor_fast_track, Arrays.asList("Yun-Jin", "Hook", "Repairing"),87),
                new PerkItem("<font color='#ffffff'><b>FINESSE</b></font>",
                        "<font color='#aaa9a9'>The threat of danger can motivate any creature to strengthen its resolve.<br><br>" +
                                "This perk activates when you are healthy." +
                                "<ul><li>Your fast vaults are <font color='#ff8800'><b>20%</b></font> faster.</li></ul>" +
                                "This perk goes on cooldown for <font color='#ffff1a'><b>40</font>/<font color='#199b1e'>35</font>/<font color='#ac3ee3'>30</b></font> seconds after performing a fast vault.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Just need to push myself a bit further.&quot; —&#8288;Lara Croft</i></font>",
                        R.drawable.survivor_finesse, Arrays.asList("Lara", "Chase", "Healthy"),141),
                new PerkItem("<font color='#ffffff'><b>FIXATED</b></font>",
                        "<font color='#aaa9a9'>When you have a goal in mind, there's no turning back: better to ask forgiveness than permission." +
                                "<ul><li>You can see your own scratch marks at all times.</li><br>" +
                                "<li>You walk <font color='#ffff1a'><b>10</font>/<font color='#199b1e'>15</font>/<font color='#ac3ee3'>20</b></font> % faster.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I wanna finish what we started. I want to kill it.&quot; —&#8288;Nancy Wheeler</i></font>",
                        R.drawable.survivor_fixated, Arrays.asList("Nancy","Self-Aware", "Chase"),67),
                new PerkItem("<font color='#ffffff'><b>FLASHBANG</b></font>",
                        "<font color='#aaa9a9'>You've adapted to a world in chaos and making what you can from the debris.<br><br>" +
                                "After completing <font color='#ffff1a'><b>50</font>/<font color='#199b1e'>45</font>/<font color='#ac3ee3'>40</b></font>&nbsp;% progress on any generator, <i>Flashbang</i> activates.<br><br>" +
                                "Enter a locker and press the <i>Active Ability Button 1</i> to craft a flash grenade." +
                                "<ul><li>1 charge.</li><br>" +
                                "<li>Detonates with a loud bang and flashing light.</li><br>" +
                                "<li>Creates a noise notification.</li><br>" +
                                "<li>Can be used to distract or blind.</li></ul>" +
                                "You leave the flash grenade behind when escaping the trial.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Get outta my face!&quot; —&#8288;Leon S. Kennedy</i></font>",
                        R.drawable.survivor_flashbang, Arrays.asList("Leon", "Chase"),94),
                new PerkItem("<font color='#ffffff'><b>FLIP-FLOP</b></font>",
                        "<font color='#aaa9a9'>You have an uncanny ability to escape the inevitable." +
                                "<ul><li>While in dying state, <font color='#ff8800'><b>50%</b></font> of your recovery progression is converted into wiggle progression when you are picked up by The Killer, up to a maximum of " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>45</font>/<font color='#ac3ee3'>50</b></font> % total wiggle progression.</li></ul></font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Catch ya on the flip-flop.&quot; —&#8288;Ash Williams</i></font>",
                        R.drawable.survivor_flip_flop, Arrays.asList("Ash", "Slug", "Wiggle"),64),
                new PerkItem("<font color='#ffffff'><b>FOGWISE</b></font>",
                        "<font color='#aaa9a9'>In your countless years in the fog, you've seen it all, and when you're focused, you can remember most of it, too." +
                                "<ul><li>Hitting a great Skill Check while repairing a generator reveals the Killer's aura to you for " +
                                "<font color='#ffff1a'><b>4</font>/<font color='#199b1e'>5</font>/<font color='#ac3ee3'>6</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I have seen great cruelty... and I have also seen another way.&quot; —&#8288;Vittorio Toscano</i></font>",
                        R.drawable.survivor_fogwise, Arrays.asList("Vittorio", "Killer Aura"),115),
                new PerkItem("<font color='#ffffff'><b>FOR THE PEOPLE</b></font>",
                        "<font color='#aaa9a9'>You risk life and injury for others.<br><br>" +
                                "<i>For the People</i> is only active while at full health." +
                                "<ul><li>Press the <i>Active Ability Button 1</i> while healing another Survivor without a Med-Kit to instantly heal them from dying to injured, or from injured to healthy.</li><br>" +
                                "<li>You become injured and receive the <font color='#ffffff'><b>Broken</b></font> status effect for " +
                                "<font color='#ffff1a'><b>80</font>/<font color='#199b1e'>70</font>/<font color='#ac3ee3'>60</b></font> seconds.</li><br>" +
                                "<li>You become the Obsession.</li></ul>" +
                                "Equipping this perk decreases your chances of being The Killer's Obsession at the start of the trial.</font><br><br>" + broken + "<br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;We can write our own story and decide how it really ends.&quot; —&#8288;Zarina Kassir</i></font>",
                        R.drawable.survivor_for_the_people, Arrays.asList("Zarina", "Broken", "Healing", "Obsession"),75),
                new PerkItem("<font color='#ffffff'><b>FRIENDLY COMPETITION</b></font>",
                        "<font color='#aaa9a9'>You revel in the community spirit of a competition, and inspire others to follow suit.<br><br>" +
                                "Whenever you finish repairing a generator with at least one other Survivor, this perk activates." +
                                "<ul><li>You and other survivors who finished repairing the generator with you get <font color='#ff8800'><b>5%</b></font> increased repair progress speed for " +
                                "<font color='#ffff1a'><b>45</font>/<font color='#199b1e'>60</font>/<font color='#ac3ee3'>75</b></font> seconds.</li></ul>" +
                                "<i>Survivors can only have one instance of this perk's ability active at once</i>.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;C'mon, let's do this.&quot; —&#8288;Thalita Lyra</i></font>",
                        R.drawable.survivor_friendly_competition, Arrays.asList("Thalita", "Repairing"),118),
                new PerkItem("<font color='#ffffff'><b>HARDENED</b></font>",
                        "<font color='#aaa9a9'>Live long enough, and survival will run in your blood.<br><br>" +
                                "This perk activates after you complete all of the following:" +
                                "<ul><li>unlock a chest.</li><br>" +
                                "<li>cleanse or bless a totem.</li></ul>" +
                                "For the rest of the trial, anytime you would scream, reveal the Killer's aura for " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> seconds instead.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Got to keep quiet. That thing is still out there.&quot; —&#8288;Lara Croft</i></font>",
                        R.drawable.survivor_hardened, Arrays.asList("Lara", "Killer Aura", "Scream"),142),
                new PerkItem("<font color='#ffffff'><b>HEAD ON</b></font>",
                        "<font color='#aaa9a9'>When your mind is set, there better be no one standing in your way.<br><br>" +
                                "While standing in a locker, for <font color='#ff8800'><b>3 seconds</b></font>, the perk activates." +
                                "<ul><li>While the perk is activated, performing a rushed action to leave a locker stuns The Killer for <font color='#ff0808'><b>3 seconds</b></font> if they are standing within range.</li></ul>" +
                                "Causes the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.<br><br>" +
                                "<i>Head On</i> cannot be used while <font color='#ffffff'><b>Exhausted</b></font>.<br><br>" +
                                "<i>Head On</i> cannot be used when you have idle crows.</font><br><br>" + exhaustion + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;People are remembered for the challenges they overcome. You can run away and forget what you're capable of or you can face your fears and remind the world who you are.&quot; —&#8288;Jane Romero</i></font>",
                        R.drawable.survivor_head_on, Arrays.asList("Jane", "Exhaustion", "Stun"),60),
                new PerkItem("<font color='#ffffff'><b>HOPE</b></font>",
                        "<font color='#aaa9a9'>The growing odds of a successful escape fill you with hope and give you wings." +
                                "<ul><li>As soon as the exit gates are powered you gain a " +
                                "<font color='#ffff1a'><b>5</font>/<font color='#199b1e'>6</font>/<font color='#ac3ee3'>7</b></font> % <font color='#ffffff'><b>Haste</b></font> status effect.</li></ul></font>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Buckle up, fuckos! Let's roll!&quot; —&#8288;Lost Tapes: Nikki</i></font>",
                        R.drawable.survivor_hope, Arrays.asList("Default", "End Game", "Haste"),3),
                new PerkItem("<font color='#ffffff'><b>HYPERFOCUS</b></font>",
                        "<font color='#aaa9a9'>You throw yourself entirely into your tasks and find ways to be more efficient than anyone else.<br><br>" +
                                "After hitting a great Skill Check while repairing or healing, this perk gains <font color='#ffff1a'><b>1&nbsp;token</b></font>, up to <font color='#ff8800'><b>6&nbsp;tokens</b></font>." +
                                "<ul><li>Each token increases the chance of Skill Check trigger by <font color='#ff0808'><b>2%</b></font>, the Skill Check cursor speed by <font color='#ff0808'><b>4%</b></font> and the bonus progression for great Skill Checks by " +
                                "<font color='#ffff1a'><b>10</font>/<font color='#199b1e'>20</font>/<font color='#ac3ee3'>30</b></font> % of its base value.</li></ul>" +
                                "The perk loses all tokens in case of normal Skill Check successes, Skill Check fails, or if the action is stopped by any means.</font>",
                        R.drawable.survivor_hyperfocus, Arrays.asList("Rebecca", "Healing", "Repairing"),113),
                new PerkItem("<font color='#ffffff'><b>INNER FOCUS</b></font>",
                        "<font color='#aaa9a9'>You have honed your ability to see through the haze of the Ravage." +
                                "<ul><li>You can see other Survivors' scratch marks.</li><br>" +
                                "<li>When the Killer causes another Survivor to lose a health state, the Killer's aura is revealed to you for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;The death, the trauma, the fear... it all leads here. The Overlap.&quot; —&#8288;Haddie Kaur, Ravages of the Abyss Episode 11</i></font>",
                        R.drawable.survivor_inner_focus, Arrays.asList("Haddie", "Killer Aura"),105),
                new PerkItem("<font color='#ffffff'><b>INNER STRENGTH</b></font>",
                        "<font color='#aaa9a9'>You look inward and trust your instincts when you feel lost and alone.<br><br>" +
                                "Each time you complete a Totem cleanse action, <i>Inner Strength</i> activates. If you are already afflicted by the <font color='#ffffff'><b>Broken</b></font> status effect, Inner Strength does not activate." +
                                "<ul><li>While <i>Inner Strength</i> is active, hiding inside a locker for " +
                                "<font color='#ffff1a'><b>10</font>/<font color='#199b1e'>9</font>/<font color='#ac3ee3'>8</b></font> seconds while injured automatically heals you from injured to healthy.</li></ul>" +
                                "<i>Inner Strength</i> becomes deactivated as soon as it has successfully triggered.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;All this time I've been trying so hard to pretend like everything's fine, but it's not.&quot; —&#8288;Nancy Wheeler</i></font>",
                        R.drawable.survivor_inner_strength, Arrays.asList("Nancy", "Inner Healing", "Healing", "Totem"),68),
                new PerkItem("<font color='#ffffff'><b>INVOCATION: TREACHEROUS CROWS</b></font>",
                        "<font color='#aaa9a9'>One with arcane knowledge has no reason to fear those watchful birds.<br><br>" +
                                "When in the basement near the circle, press the <i>Ability Button 1</i> to begin the Invocation.<br><br>" +
                                "Invocations take <font color='#ff8800'><b>60&nbsp;seconds</b></font>. Other Survivors will see your aura during this and can join an ongoing interaction.<br><br>" +
                                "Once the Invocation is completed:" +
                                "<ul><li>You become injured and gain the <font color='#ffffff'><b>Broken</b></font> status effect for the rest of the trial.</li><br>" +
                                "<li>When a Survivor is in the Terror Radius and the Killer scares a crow, their aura is revealed to all Survivors for " +
                                "<font color='#ffff1a'><b>1</font>/<font color='#199b1e'>1.5</font>/<font color='#ac3ee3'>2</b></font> seconds.</li></ul>" +
                                "Completing the Invocation disables that perk for all Survivors.</font><br><br>" + broken + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Remember your training. They taught you all about the crows.&quot; —&#8288;Taurie Cain</i></font>",
                        R.drawable.survivor_invocation_treacherous_crows, Arrays.asList("Taurie", "Aura", "Broken", "Invocation"),147),
                new PerkItem("<font color='#ffffff'><b>INVOCATION: WEAVING SPIDERS</b></font>",
                        "<font color='#aaa9a9'>The place where fear festers and terror treads is also where those with the gift can reach across the veil.<br><br>" +
                                "When in the basement near the circle, press the <i>Ability Button 1</i> to begin the Invocation.<br><br>" +
                                "Invocations take <font color='#ff8800'><b>60&nbsp;seconds</b></font>. Other Survivors will see your aura during this and can join an ongoing interaction.<br><br>" +
                                "Once the Invocation is completed:" +
                                "<ul><li>You become Injured and gain the <font color='#ffffff'><b>Broken</b></font> status effect for the rest of the trial.</li><br>" +
                                "<li>Reduce the maximum required generator charges of all remaining generators by " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>9</font>/<font color='#ac3ee3'>10</b></font>.</li></ul>" +
                                "Completing the Invocation disables that perk for all Survivors.</font><br><br>" + broken + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I call upon the spirits of the night, to aid us in our desperate flight!&quot; —&#8288;Sable</i></font>",
                        R.drawable.survivor_invocation_weaving_spiders, Arrays.asList("Sable", "Broken", "Invocation", "Repairing"),135),
                new PerkItem("<font color='#ffffff'><b>IRON WILL</b></font>",
                        "<font color='#aaa9a9'>You're able to concentrate and enter a meditative-like state to numb some pain." +
                                "<ul><li>Grunts of pain caused by injuries are reduced by " +
                                "<font color='#ffff1a'><b>80</font>/<font color='#199b1e'>90</font>/<font color='#ac3ee3'>100</b></font> %.</li></ul>" +
                                "Does not function while <font color='#ffffff'><b>Exhausted</b></font>. Does not inflict <font color='#ffffff'><b>Exhausted</b></font>.</font><br><br>" + exhaustion,
                        R.drawable.survivor_iron_will, Arrays.asList("Jake", "Chase", "Injured"),25),
                new PerkItem("<font color='#ffffff'><b>KINDRED</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>While you are on the hook, all Survivor's auras are revealed to all other Survivors.</li><br>" +
                                "<li>If The Killer is within a <font color='#ffff1a'><b>8</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>16</b></font> meter range, The Killer's aura is revealed to you and all other Survivors.</li><br>" +
                                "<li>While a Survivor other than you is on the hook, all other Survivors' auras are revealed to you.</li><br>" +
                                "<li>If The Killer is within a <font color='#ffff1a'><b>8</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>16</b></font> meter range of the hooked Survivor, The Killer's aura is revealed to you.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Be kind to one another. We're all in this together.&quot; —&#8288;Lost Tapes: Sujan</i></font>",
                        R.drawable.survivor_kindred, Arrays.asList("Default", "Aura", "Hook", "Killer Aura"),14),
                new PerkItem("<font color='#ffffff'><b>LEADER</b></font>",
                        "<font color='#aaa9a9'>You're able to organize a team to cooperate more efficiently." +
                                "<ul><li>Increases other Survivors' healing, sabotage, unhooking, cleansing, opening Exit Gates, and chest unlocking speeds by " +
                                "<font color='#ffff1a'><b>15</font>/<font color='#199b1e'>20</font>/<font color='#ac3ee3'>25</b></font> % when they are within a <font color='#ff8800'><b>8 meter</b></font> range from you.</li></ul>" +
                                "Survivors can only be affected by one <i>Leader</i> effect at a time.<br><br>" +
                                "This effect persists on other Survivors for <font color='#ff0808'><b>15&nbsp;seconds</b></font> after leaving the <i>Leader</i>'s effective perk range.</font>",
                        R.drawable.survivor_leader, Arrays.asList("Dwight", "Exit Gate", "Healing", "Totem"),16),
                new PerkItem("<font color='#ffffff'><b>LEFT BEHIND</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>If you are the last Survivor remaining in the Trial, you can see the aura of the Hatch within a " +
                                "<font color='#ffff1a'><b>24</font>/<font color='#199b1e'>28</font>/<font color='#ac3ee3'>32</b></font> meter range.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I'm not horseshittin' around. I'm doing this alone!&quot; —&#8288;Bill</i></font>",
                        R.drawable.survivor_left_behind, Arrays.asList("Bill", "Aura", "End Game"),37),
                new PerkItem("<font color='#ffffff'><b>LIGHT-FOOTED</b></font>",
                        "<font color='#aaa9a9'>Crossing paths with deadly killers has taught you the value of discretion.<br><br>" +
                                "When you are healthy, this perk activates." +
                                "<ul><li>Your running footsteps are silent.</li></ul>" +
                                "This perk goes on cooldown for <font color='#ffff1a'><b>28</font>/<font color='#199b1e'>24</font>/<font color='#ac3ee3'>20</b></font> seconds after performing a rushed action.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Come on, cat.&quot; —&#8288;Ellen Ripley</i></font>",
                        R.drawable.survivor_light_footed, Arrays.asList("Ellen", "Chase", "Healthy"),131),
                new PerkItem("<font color='#ffffff'><b>LIGHTWEIGHT</b></font>",
                        "<font color='#aaa9a9'>Your running is light and soft, making your tracks harder to follow." +
                                "<ul><li>Scratch marks stay visible <font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> seconds less than normal, and their spacing is inconsistent.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Take it slow, he knows where you've been... just like I've always said: live slow and die old.&quot; —&#8288;Lost Tapes: Dylan</i></font>",
                        R.drawable.survivor_lightweight, Arrays.asList("Default", "Chase"),4),
                new PerkItem("<font color='#ffffff'><b>LITHE</b></font>",
                        "<font color='#aaa9a9'><ul><li>After performing a rushed vault, you gain <font color='#ffff1a'><b>50%</b></font> <font color='#ffffff'><b>Haste</b></font> for <font color='#ff8800'><b>3&nbsp;seconds</b></font>.</li></ul>" +
                                "Causes the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.<br><br>" +
                                "<i>Lithe</i> cannot be used while <font color='#ffffff'><b>Exhausted</b></font>.</font><br><br>" + exhaustion + "<br><br>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;U mad?&quot; —&#8288;Feng Min</i></font>",
                        R.drawable.survivor_lithe, Arrays.asList("Feng", "Exhaustion", "Haste"),40),
                new PerkItem("<font color='#ffffff'><b>LOW PROFILE</b></font>",
                        "<font color='#aaa9a9'>You work best alone. When it's just you and your pursuer, you know how to disappear.<br><br>" +
                                "When you become the last Survivor standing, this perk activates." +
                                "<ul><li>Hide your scratch marks, pools of blood and grunts of pain caused by injuries for " +
                                "<font color='#ffff1a'><b>70</font>/<font color='#199b1e'>80</font>/<font color='#ac3ee3'>90</b></font> seconds.</li></ul></font>",
                        R.drawable.survivor_low_profile, Arrays.asList("Ada", "Chase", "End Game"),110),
                new PerkItem("<font color='#ffffff'><b>LUCKY BREAK</b></font>",
                        "<font color='#aaa9a9'>You've had your share of scrapes and bruises, but luck's always on your side.<br><br>" +
                                "<i>Lucky Break</i> activates any time you are injured." +
                                "<ul><li>While <i>Lucky Break</i> is active, you won't leave trails of blood or scratch marks for a total of " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> seconds.</li></ul>" +
                                "While healthy, for each <font color='#ff8800'><b>1&nbsp;second</b></font> spent healing another Survivor, increase <i>Lucky Break</i>'s duration by <font color='#ff8800'><b>1&nbsp;second</b></font>.<br><br>" +
                                "<i>Lucky Break</i>'s duration cannot increase beyond its starting value.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;That's not enough to beat me. Not even close.&quot; —&#8288;Yui Kimura</i></font>",
                        R.drawable.survivor_lucky_break, Arrays.asList("Yui", "Chase", "Injured"),74),
                new PerkItem("<font color='#ffffff'><b>LUCKY STAR</b></font>",
                        "<font color='#aaa9a9'>You know how to stay calm in the face of incomprehensible danger." +
                                "<ul><li>When you hide in a locker, you make no grunts of pain.</li><br>" +
                                "<li>After exiting the locker, you see the aura of the closest generator and all Survivors, leave no pools of blood and make no grunts of pain for <font color='#ff8800'><b>30&nbsp;seconds</b></font>.</li></ul>" +
                                "This perk goes on cooldown for <font color='#ffff1a'><b>40</font>/<font color='#199b1e'>35</font>/<font color='#ac3ee3'>30</b></font> seconds.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;You are my... lucky star...&quot; —&#8288;Ellen Ripley</i></font>",
                        R.drawable.survivor_lucky_star, Arrays.asList("Ellen", "Aura", "Chase"),129),
                new PerkItem("<font color='#ffffff'><b>MADE FOR THIS</b></font>",
                        "<font color='#aaa9a9'>You were born to survive, and raised to adapt.<br><br>" +
                                "<i>Made for This</i> activates while you are in the injured state." +
                                "<ul><li>After you finish healing another Survivor, gain the <font color='#ffffff'><b>Endurance</b></font> status effect for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> seconds.</li><br>" +
                                "<li>While affected by <font color='#ffffff'><b>Deep&nbsp;Wound</b></font>, you run <font color='#ff8800'><b>3%</b></font> faster.</li></ul></font>" + endurance + "<br><br>" + deep_wound + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I didn't come here to be robot food.&quot; —&#8288;Gabriel Soma</i></font>",
                        R.drawable.survivor_made_for_this, Arrays.asList("Gabriel", "Endurance", "Haste", "Healing", "Injured"),124),
                new PerkItem("<font color='#ffffff'><b>METTLE OF MAN</b></font>",
                        "<font color='#aaa9a9'>Evil has a way of always finding you.<br><br>" +
                                "After you earn <font color='#ff8800'><b>3</b></font> Protection Hit scoring events, Mettle of Man activates." +
                                "<ul><li>Once activated, the next occasion that would put you into the dying state from the injured state is ignored.</li></ul>" +
                                "The next time you heal back to full health, your aura will be revealed to the Killer when you are further than " +
                                "<font color='#ffff1a'><b>12</font>/<font color='#199b1e'>14</font>/<font color='#ac3ee3'>16</b></font> meters from the Killer.<br><br>" +
                                "<i>Mettle of Man</i> will deactivate the next time you are put into the dying state.<br><br>" +
                                "<i>Increases your chances to be the Killer's Obsession</i>.</font><br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Evil has a bullseye on my back the size of Tiger Stadium.&quot; —&#8288;Ash Williams</i></font>",
                        R.drawable.survivor_mettle_of_man, Arrays.asList("Ash", "Endurance", "Obsession"),65),
                new PerkItem("<font color='#ffffff'><b>MIRRORED ILLUSION</b></font>",
                        "<font color='#aaa9a9'>A familiar spell made unfamiliar in this corrupted landscape.<br><br>" +
                                "This perk activates after completing a total of <font color='#ff8800'><b>20%</b></font> worth of repairs on generators." +
                                "<ul><li>Press the <i>Ability Button 2</i> when next to a generator, totem, chest or exit gate to spawn a static illusion that lasts for " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> seconds.</li></ul>" +
                                "Then, the perk deactivates.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Just... stay there... perfect!&quot; —&#8288;Baermar</i></font>",
                        R.drawable.survivor_mirrored_illusion, Arrays.asList("Aestri"),138),
                new PerkItem("<font color='#ffffff'><b>MOMENT OF GLORY</b></font>",
                        "<font color='#aaa9a9'>A hero should always have the chance to make a comeback.<br><br>" +
                                "This perk activates after you open or rummage through <font color='#ff8800'><b>2&nbsp;chests</b></font>.<br><br>" +
                                "When you become injured, you also become <font color='#ffffff'><b>Broken</b></font>." +
                                "<ul><li>Automatically heal 1 health state after " +
                                "<font color='#ffff1a'><b>80</font>/<font color='#199b1e'>70</font>/<font color='#ac3ee3'>60</b></font> seconds.</li></ul>" +
                                "Then, this perk deactivates.<br><br>" +
                                "<i>This effect is canceled if you enter the dying state</i>.<br><br>" +
                                "<i>This perk will not activate if you are already suffering from the <font color='#ffffff'><b>Broken</b></font> status effect</i>.</font><br><br>" + broken + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Never lose hope for a brighter tomorrow.&quot; —&#8288;Trevor</i></font>",
                        R.drawable.survivor_moment_of_glory, Arrays.asList("Trevor", "Broken", "Healing", "Injured"),146),
                new PerkItem("<font color='#ffffff'><b>NO MITHER</b></font>",
                        "<font color='#aaa9a9'>You are affected by the <font color='#ffffff'><b>Broken</b></font> status effect for the duration of the trial.<br><br>" +
                                "Your thick blood coagulates practically instantly." +
                                "<ul><li>You don't leave pools of blood.</li><br>" +
                                "<li>Grunts of pain caused by injuries are reduced by " +
                                "<font color='#ffff1a'><b>25</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>75</b></font> % at any time.</li><br>" +
                                "<li>Your recovery speed is increased by " +
                                "<font color='#ffff1a'><b>15</font>/<font color='#199b1e'>20</font>/<font color='#ac3ee3'>25</b></font>&nbsp;% and you can completely recover from the dying state.</li></ul></font>" + broken + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I lost it. Just lamped him one. They went and banned me didn't they. Went t'pub afterwards, had a few pints and moved on to the next chapter. I couldn't be mithered with it all anyway, you know what I mean? Can't be arsed.&quot; —&#8288;David King</i></font>",
                        R.drawable.survivor_no_mither, Arrays.asList("David", "Broken", "Chase", "Injured", "Slug"),43),
                new PerkItem("<font color='#ffffff'><b>NO ONE LEFT BEHIND</b></font>",
                        "<font color='#aaa9a9'>It is inconceivable to leave someone behind.<br><br>" +
                                "Once the exit gates are powered, you gain the following effects:" +
                                "<ul><li><font color='#ffff1a'><b>50</font>/<font color='#199b1e'>75</font>/<font color='#ac3ee3'>100</b></font> % bonus action speed when healing and unhooking other Survivors.</li><br>" +
                                "<li>When unhooking a Survivor, they gain <font color='#ffff1a'><b>10%</b></font>&nbsp;<font color='#ffffff'><b>Haste</b></font> for <font color='#ff8800'><b>15&nbsp;seconds</b></font>.</li><br>" +
                                "<li>The auras of all other Survivors are revealed to you.</li></ul></font>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;... yeah, no shit. But I believe we can outsmart and overthrow him if we work together. Don't be predictable and selfish!&quot; —&#8288;Lost Tapes: Clyde</i></font>",
                        R.drawable.survivor_no_one_left_behind, Arrays.asList("Default", "Aura", "End Game", "Haste", "Healing"),5),
                new PerkItem("<font color='#ffffff'><b>OBJECT OF OBSESSION</b></font>",
                        "<font color='#aaa9a9'>A supernatural bond links you to the Killer." +
                                "<ul><li>While your aura is revealed to the Killer, the Killer's aura becomes visible to you and you gain a " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>6</b></font> % bonus to healing, repairing and cleansing speed.</li><br>" +
                                "<li>If you are the Obsession, your aura is revealed to the Killer for <font color='#ff8800'><b>3&nbsp;seconds</b></font> once every <font color='#ff0808'><b>30&nbsp;seconds</b></font>.</li></ul>" +
                                "Increases your chances of being the Obsession.</font><br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;He was watching me!&quot; —&#8288;Laurie Strode</i></font>",
                        R.drawable.survivor_object_of_obsession, Arrays.asList("Laurie", "Healing", "Killer Aura", "Repairing", "Totem"),31),
                new PerkItem("<font color='#ffffff'><b>OFF THE RECORD</b></font>",
                        "<font color='#aaa9a9'>You've learned that a quiet approach is sometimes best.<br><br>" +
                                "Once you are unhooked or escape from the hook, <i>Off the Record</i> activates for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>70</font>/<font color='#ac3ee3'>80</b></font> seconds.<br><br>" +
                                "This perk and its effects are disabled once the exit gates are powered.<br><br>" +
                                "While <i>Off the Record</i> is active:" +
                                "<ul><li>Your aura will not be shown to The Killer.</li><br>" +
                                "<li>Grunts of pain caused by injuries are reduced by <font color='#ff8800'><b>100%</b></font>.</li><br>" +
                                "<li>Gain the <font color='#ffffff'><b>Endurance</b></font> status effect.</li></ul></font>" + endurance + "<br><br>" + deep_wound + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Trust me, I investigate thoroughly and discreetly.&quot; —&#8288;Zarina Kassir</i></font>",
                        R.drawable.survivor_off_the_record, Arrays.asList("Zarina", "Endurance", "Hook", "Chase"),76),
                new PerkItem("<font color='#ffffff'><b>OPEN-HANDED</b></font>",
                        "<font color='#aaa9a9'>Strengthens the potential of you and your team's aura reading abilities." +
                                "<ul><li>Increases aura reading ranges by " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>16</b></font> meters.</li><br>" +
                                "<li>Survivors may only be affected by one <i>Open&#8288;-&#8288;Handed</i> effect at a time.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Paying attention is what kept me alive through the years. That, and my good looks of course.&quot; —&#8288;Ace</i></font>",
                        R.drawable.survivor_open_handed, Arrays.asList("Ace", "Aura"),34),
                new PerkItem("<font color='#ffffff'><b>OVERCOME</b></font>",
                        "<font color='#aaa9a9'>You've calculated how much energy you can risk to expend." +
                                "<ul><li>When you are injured, you retain the movement speed bonus for <font color='#ff8800'><b>2 seconds</b></font> longer.</li></ul>" +
                                "<i>Overcome</i> causes the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.<br><br>" +
                                "<i>Overcome</i> cannot be used when <font color='#ffffff'><b>Exhausted</b></font>.</font><br><br>" + exhaustion + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;After careful analysis, we're getting the hell out of here!&quot; —&#8288;Jonah Vasquez</i></font>",
                        R.drawable.survivor_overcome, Arrays.asList("Jonah", "Exhaustion", "Haste", "Injured"),99),
                new PerkItem("<font color='#ffffff'><b>OVERZEALOUS</b></font>",
                        "<font color='#aaa9a9'>Fighting back against the Ravage motivates and inspires you.<br><br>" +
                                "After cleansing or blessing a Totem, this perk activates." +
                                "<ul><li>Your generator repair speed is increased by " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>9</font>/<font color='#ac3ee3'>10</b></font> %. This bonus is doubled if you cleanse or bless a Hex totem.</li></ul>" +
                                "This perk deactivates when you lose a health state by any means.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;The Ravage senses us. We need to work fast.&quot; —&#8288;Haddie Kaur, Ravages of the Abyss Episode 9</i></font>",
                        R.drawable.survivor_overzealous, Arrays.asList("Haddie", "Repairing", "Totem"),107),
                new PerkItem("<font color='#ffffff'><b>PARENTAL GUIDANCE</b></font>",
                        "<font color='#aaa9a9'>You have inherited the ability to hear the dead – and now, the dead warn you of danger." +
                                "<ul><li>After stunning the Killer by any means, your scratch marks, pools of blood and grunts of pain are hidden for " +
                                "<font color='#ffff1a'><b>5</font>/<font color='#199b1e'>6</font>/<font color='#ac3ee3'>7</b></font> seconds.</li></ul></font>",
                        R.drawable.survivor_parental_guidance, Arrays.asList("Yoichi", "Chase", "Stun"),102),
                new PerkItem("<font color='#ffffff'><b>PHARMACY</b></font>",
                        "<font color='#aaa9a9'>You have a knack for finding medicine." +
                                "<ul><li>Unlocking chests is <font color='#ffff1a'><b>70</font>/<font color='#199b1e'>85</font>/<font color='#ac3ee3'>100</b></font> % faster.</li><br>" +
                                "<li>The hearing distance for noises from unlocking chests are reduced by <font color='#ff8800'><b>20 meters</b></font>.</li><br>" +
                                "<li><i>Pharmacy</i> guarantees an Emergency Med-kit upon completing the interaction.</li></ul></font>",
                        R.drawable.survivor_pharmacy, Arrays.asList("Quentin", "Item"),45),
                new PerkItem("<font color='#ffffff'><b>PLOT TWIST</b></font>",
                        "<font color='#aaa9a9'>Big moments are vital, but you know that sometimes an understated read can be just as powerful.<br><br>" +
                                "<i>Plot Twist</i> activates when you are injured.<br><br>" +
                                "Press the <i>Ability Button 2</i> while crouched and motionless to enter the dying state silently." +
                                "<ul><li>When using <i>Plot Twist</i> to enter the dying state: you leave no blood pools and you make no noise and you can fully recover from the dying state.</li><br>" +
                                "<li>When you recover by yourself using <i>Plot&nbsp;Twist</i>, you are healed instantly and you gain <font color='#ff8800'><b>50%</b></font>&nbsp;<font color='#ffffff'><b>Haste</b></font> for " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> seconds.</li></ul>" +
                                "<i>This perk deactivates if you recover by yourself by any means</i>.<br><br>" +
                                "<i>This perk re-activates when the exit gates are powered</i>.<br><br>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I think you'll find this shooting location... captivating.&quot; —&#8288;Pauline Stamper</i></font>",
                        R.drawable.survivor_plot_twist, Arrays.asList("Nicolas", "Haste", "Healing", "Injured", "Slug"),128),
                new PerkItem("<font color='#ffffff'><b>PLUNDERER'S INSTINCT</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>Reveal unopened chests and items when within a " +
                                "<font color='#ffff1a'><b>32</font>/<font color='#199b1e'>48</font>/<font color='#ac3ee3'>64</b></font> meter range.</li><br>" +
                                "<li>Increases the odds of finding an item of higher rarity from chests by <font color='#ff8800'><b>50%</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;The pioneers used to loot these babies for hours.&quot; —&#8288;Lost Tapes: Aizeyu</i></font>",
                        R.drawable.survivor_plunderers_instinct, Arrays.asList("Default", "Item"),6),
                new PerkItem("<font color='#ffffff'><b>POISED</b></font>",
                        "<font color='#aaa9a9'>Achieving goals boosts your confidence." +
                                "<ul><li>When first starting repairs on a generator, reveal the Killer's aura for " +
                                "<font color='#ff8800'><b>6 seconds</b></font>.</li><br>" +
                                "<li>When a generator is completed, you leave no scratch marks for " +
                                "<font color='#ffff1a'><b>10</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>14</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Ok, stay calm. Don't overthink it and just keep moving forward: you got this.&quot; —&#8288;Jane Romero</i></font>",
                        R.drawable.survivor_poised, Arrays.asList("Jane", "Chase", "Killer Aura"),61),
                new PerkItem("<font color='#ffffff'><b>POTENTIAL ENERGY</b></font>",
                        "<font color='#aaa9a9'>Your arcane abilities have adapted to The Entity's Realm after centuries of wandering, granting you unprecedented control over its many devices.<br><br>" +
                                "After working on a generator for " +
                                "<font color='#ffff1a'><b>12</font>/<font color='#199b1e'>10</font>/<font color='#ac3ee3'>8</b></font> uninterrupted seconds, press the <i>Active Ability Button 2</i> to activate this perk.<br><br>" +
                                "When this perk is active, repairing the generator will charge this perk instead of making the generator progress." +
                                "<ul><li>For each <font color='#ffff1a'><b>1.5%</b></font> of generator repair, the perk will gain <font color='#ffff1a'><b>1 token</b></font>, up to <font color='#ffff1a'><b>20 tokens</b></font>.</li><br>" +
                                "<li>While this perk has at least one token and you are working on a generator, you can press the <i>Active Ability Button 2</i> to consume all the tokens and instantly make the generator progress by <font color='#ff8800'><b>1%</b></font> for each token.</li></ul>" +
                                "This perk then deactivates.<br><br>" +
                                "If you lose a health state while this perk has at least <font color='#ff0808'><b>1 token</b></font>, the perk will lose all tokens and deactivate. Missing a Skill Check will also result in some tokens lost.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;When you look a layer deeper, you realize... everything is connected.&quot; —&#8288;Vittorio Toscano</i></font>",
                        R.drawable.survivor_potential_energy, Arrays.asList("Vittorio", "Repairing"),114),
                new PerkItem("<font color='#ffffff'><b>POWER STRUGGLE</b></font>",
                        "<font color='#aaa9a9'>You've never given up and you're not about to start now." +
                                "<ul><li>Whenever you are in the dying state, you see the auras of available Pallets.</li><br>" +
                                "<li>While being carried by The Killer, reaching " +
                                "<font color='#ffff1a'><b>25</font>/<font color='#199b1e'>20</font>/<font color='#ac3ee3'>15</b></font> % wiggle progress activates <i>Power Struggle</i>.</li><br>" +
                                "<li>While <i>Power Struggle</i> is active, you can drop a nearby, standing pallet to stun The Killer.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I relied on others to protect me once and I lost everything. Never again.&quot; —&#8288;Élodie Rakoto</i></font>",
                        R.drawable.survivor_power_struggle, Arrays.asList("Élodie", "Stun", "Wiggle"),86),
                new PerkItem("<font color='#ffffff'><b>PREMONITION</b></font>",
                        "<font color='#aaa9a9'>You have the undeniable capability to sense danger." +
                                "<ul><li>Get an auditory warning when looking in the direction of the Killer in a <font color='#ffff1a'><b>45 degree</b></font> cone within a range of <font color='#ff8800'><b>36 meters</b></font>.</li></ul>" +
                                "<i>Premonition</i> has a cooldown of <font color='#ffff1a'><b>60</font>/<font color='#199b1e'>45</font>/<font color='#ac3ee3'>30</b></font> seconds each time it activates.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;I have a bad feeling about this!&quot;</i></font>",
                        R.drawable.survivor_premonition, Arrays.asList("Default"),7),
                new PerkItem("<font color='#ffffff'><b>PROVE THYSELF</b></font>",
                        "<font color='#aaa9a9'><ul><li>For every other Survivor working on a generator within a <font color='#ff8800'><b>4 meter</b></font> range, gain " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> % repair speed bonus.</li><br>" +
                                "<li>This same bonus is also applied to all other Survivors within range.</li></ul>" +
                                "Survivors can only be affected by one <i>Prove Thyself</i> effect at a time.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Show me what you can do!&quot; —&#8288;Dwight</i></font>",
                        R.drawable.survivor_prove_thyself, Arrays.asList("Dwight", "Repairing"),17),
                new PerkItem("<font color='#ffffff'><b>QUICK & QUIET</b></font>",
                        "<font color='#aaa9a9'>You do not make as much noise as others when quickly vaulting over obstacles or hiding in lockers." +
                                "<ul><li>The vault and hide actions' noise detection and audio range is reduced by <font color='#ff8800'><b>100%</b></font>.</li></ul>" +
                                "This effect can only trigger once every " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>20</b></font> seconds.</font>",
                        R.drawable.survivor_quick_and_quiet, Arrays.asList("Meg", "Chase"),19),
                new PerkItem("<font color='#ffffff'><b>QUICK GAMBIT</b></font>",
                        "<font color='#aaa9a9'>When you have a Killer's attention, you know how to keep it; others can be confident they won't be interrupted any time soon." +
                                "<ul><li>When you are chased by the Killer, see the aura of other Survivors.</li><br>" +
                                "<li>Any Survivor repairing a generator gains a " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font>&nbsp;% repair speed bonus.</li></ul>" +
                                "This perk goes on cooldown for <font color='#ff8800'><b>60&nbsp;seconds</b></font> when you lose a health state.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;We need not resort to violence. And I shall prove it.&quot; —&#8288;Vittorio Toscano</i></font>",
                        R.drawable.survivor_quick_gambit, Arrays.asList("Vittorio", "Aura", "Chase", "Repairing"),116),
                new PerkItem("<font color='#ffffff'><b>REACTIVE HEALING</b></font>",
                        "<font color='#aaa9a9'>The more the situation becomes compromised, the more determined you become to complete the operation." +
                                "<ul><li>When another Survivor loses a health state in a <font color='#ff8800'><b>32&nbsp;meter</b></font> radius around you while you are injured, instantly increase your healing progression by " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>45</font>/<font color='#ac3ee3'>50</b></font> % of the missing healing progression.</li></ul></font>",
                        R.drawable.survivor_reactive_healing, Arrays.asList("Ada", "Healing"),109),
                new PerkItem("<font color='#ffffff'><b>REASSURANCE</b></font>",
                        "<font color='#aaa9a9'>Your presence helps allies focus, assuaging the panic associated with extreme conditions." +
                                "<ul><li>When within a <font color='#ff8800'><b>6&nbsp;meter</b></font> radius around a hooked Survivor, use the <i>Active Ability Button 2</i> to pause their struggle progression for " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> seconds.</li></ul>" +
                                "If they are on the struggle phase, it also pauses the Struggle Skill Checks.<br><br>" +
                                "<i>Reassurance</i> can only be triggered once per survivor per hook instance.",
                        R.drawable.survivor_reassurance, Arrays.asList("Rebecca", "Hook"),112),
                new PerkItem("<font color='#ffffff'><b>RED HERRING</b></font>",
                        "<font color='#aaa9a9'>You've noticed that people pay attention to whatever makes the loudest noise." +
                                "<ul><li>After repairing a generator for at least <font color='#ff8800'><b>3&nbsp;seconds</b></font>, it will be highlighted to you with a yellow aura. The generator stays highlighted until it is fully repaired, you repair a new generator, or enter a locker.</li><br>" +
                                "<li>Entering any locker will trigger a loud noise indicator for The Killer at the highlighted generator's location.</li></ul>" +
                                "<i>Red Herring</i> can only be triggered once every " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;The news edit out what is burdensome and complex, which is the truth.&quot; —&#8288;Zarina Kassir</i></font>",
                        R.drawable.survivor_red_herring, Arrays.asList("Zarina", "Aura"),77),
                new PerkItem("<font color='#ffffff'><b>REPRESSED ALLIANCE</b></font>",
                        "<font color='#aaa9a9'>You're accustomed to being hunted by malicious forces, and you've begun using it to your advantage.<br><br>" +
                                "<i>Repressed Alliance</i> activates after repairing generators for a total of " +
                                "<font color='#ffff1a'><b>55</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>45</b></font> seconds." +
                                "<ul><li>When repairing a generator while the perk is active, press the <i>Active Ability Button 1</i> to call upon The Entity to block the generator for <font color='#ff8800'><b>30&nbsp;seconds</b></font>.</li></ul>" +
                                "The perk deactivates.<br><br>" +
                                "This interaction is not available if other Survivors are repairing the generator.<br><br>" +
                                "Affected generators will be revealed by a white aura to all Survivors.</font>",
                        R.drawable.survivor_repressed_alliance, Arrays.asList("Cheryl", "Aura", "Repairing"),79),
                new PerkItem("<font color='#ffffff'><b>RESIDUAL MANIFEST</b></font>",
                        "<font color='#aaa9a9'>A lifetime of chasing the darkness has taught you that the best disinfectant is light." +
                                "<ul><li>After a successful Killer Blind action, the Killer is affected by the <font color='#ffffff'><b>Blindness</b></font> status effect for " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> seconds.</li><br>" +
                                "<li>This perk grants the ability to rummage through an opened chest once per trial and will guarantee a basic Flashlight.</li></ul>" +
                                "<font color='#e7daa2'><i>Blindness prevents the Killer from seeing auras.</i></font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;I'll never see what Haddie sees. But so long as I'm with her, I know I'm safe.&quot; —&#8288;Jordan Rois, Ravages of the Abyss Episode 5</i></font>",
                        R.drawable.survivor_residual_manifest, Arrays.asList("Haddie", "Aura", "Blindness", "Item"),106),
                new PerkItem("<font color='#ffffff'><b>RESILIENCE</b></font>",
                        "<font color='#aaa9a9'>You are motivated in dire situations." +
                                "<ul><li>Grants <font color='#ffff1a'><b>3</font>/<font color='#199b1e'>6</font>/<font color='#ac3ee3'>9</b></font> % additional speed when repairing, sabotaging, healing, unhooking, vaulting, cleansing or blessing a Totem, opening exit gates, and unlocking while injured.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Focus, even in these desperate times.&quot;</i></font>",
                        R.drawable.survivor_resilience, Arrays.asList("Default", "Chase", "Healing", "Injured", "Repairing", "Totem"),8),
                new PerkItem("<font color='#ffffff'><b>RESURGENCE</b></font>",
                        "<font color='#aaa9a9'>You've come back from near impossible odds... and you'll do it again." +
                                "<ul><li>Gain <font color='#ffff1a'><b>50</font>/<font color='#199b1e'>60</font>/<font color='#ac3ee3'>70</b></font> % healing progress instantly after being unhooked or unhooking yourself.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;It's my turn, bitch.&quot; —&#8288;Jill Valentine</i></font>",
                        R.drawable.survivor_resurgence, Arrays.asList("Jill", "Healing", "Hook"),91),
                new PerkItem("<font color='#ffffff'><b>ROOKIE SPIRIT</b></font>",
                        "<font color='#aaa9a9'>You keep a careful eye on objectives when they're slipping away.<br><br>" +
                                "Complete <font color='#ffff1a'><b>5</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>3</b></font> good or great Skill Checks while repairing generators to activate <i>Rookie Spirit</i> for the remainder of the trial." +
                                "<ul><li>Once active, you can see the aura of regressing generators.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I'll stop this, lieutenant. I promise.&quot; —&#8288;Leon S. Kennedy</i></font>",
                        R.drawable.survivor_rookie_spirit, Arrays.asList("Leon", "Aura", "Repairing"),95),
                new PerkItem("<font color='#ffffff'><b>SABOTEUR</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>See hook auras in a <font color='#ff8800'><b>56&nbsp;meter</b></font> radius from the pickup spot if another Survivor is being carried. Scourge Hooks are shown in yellow.</li><br>" +
                                "<li>Unlocks the ability to sabotage hooks without a Toolbox.</li><br>" +
                                "<li>Sabotaging a hook without a Toolbox takes <font color='#ff0808'><b>2.3 seconds</b></font>.</li><br>" +
                                "<li>The sabotage action has a <font color='#ffff1a'><b>70</font>/<font color='#199b1e'>65</font>/<font color='#ac3ee3'>60</b></font> second cooldown.</li></ul></font>",
                        R.drawable.survivor_saboteur, Arrays.asList("Jake", "Aura", "Hook"),26),
                new PerkItem("<font color='#ffffff'><b>SCAVENGER</b></font>",
                        "<font color='#aaa9a9'>Where others see junk, you see valuable improvised tools.<br><br>" +
                                "While you are holding an empty toolbox, <i>Scavenger</i> activates.<br><br>" +
                                "Succeeding a great skill check while repairing gains <font color='#ffff1a'><b>1 token</b></font>, up to <font color='#ff8800'><b>5</b></font>." +
                                "<ul><li>When you reach maximum tokens, lose all tokens and automatically recharge your toolbox to full.</li><br>" +
                                "<li>Then, your generator repair speed is <font color='#ff0808'><b>50%</b></font> slower for " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>35</font>/<font color='#ac3ee3'>30</b></font> seconds.</li><br>" +
                                "<li>This perk grants the ability to rummage through an opened chest once per Trial and will guarantee a basic Toolbox.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;It's amazing what people will throw away around here.&quot; —&#8288;Gabriel Soma</i></font>",
                        R.drawable.survivor_scavenger, Arrays.asList("Gabriel", "Item", "Repairing"),125),
                new PerkItem("<font color='#ffffff'><b>SCENE PARTNER</b></font>",
                        "<font color='#aaa9a9'>You lock in with your co-star, engaging with and reacting to each other on a higher level.<br><br>" +
                                "<i>Scene Partner</i> activates when you are in the Killer's Terror Radius." +
                                "<ul><li>Whenever you look at the Killer, scream, then see the Killer's aura for " +
                                "<font color='#ffff1a'><b>4</font>/<font color='#199b1e'>5</font>/<font color='#ac3ee3'>6</b></font> seconds.</li><br>" +
                                "<li>There is a chance you will scream again, if you do, you will see the Killer's aura for an additional <font color='#ff8800'><b>2&nbsp;seconds</b></font>.</li></ul>" +
                                "<i>Scene Partner</i> then goes on cooldown for <font color='#ff0808'><b>40&nbsp;seconds</b></font>.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;This is not in the script!&quot; —&#8288;Nicolas Cage</i></font>",
                        R.drawable.survivor_scene_partner, Arrays.asList("Nicolas", "Killer Aura", "Scream"),127),
                new PerkItem("<font color='#ffffff'><b>SECOND WIND</b></font>",
                        "<font color='#aaa9a9'>When you have healed other Survivors for the equivalent of one health state, <i>Second Wind</i> activates.<br><br>" +
                                "If you are already afflicted by the <font color='#ffffff'><b>Broken</b></font> status effect, <i>Second Wind</i> does not activate." +
                                "<ul><li>While <i>Second Wind</i> is activated, the next time you are unhooked or you unhook yourself, you are affected by the <font color='#ffffff'><b>Broken</b></font> status effect.</li><br>" +
                                "<li>After a total duration of <font color='#ffff1a'><b>28</font>/<font color='#199b1e'>24</font>/<font color='#ac3ee3'>20</b></font> seconds, <i>Second Wind</i> automatically heals you from injured to healthy.</li></ul>" +
                                "<i>Second Wind</i> deactivates once you become healthy or if you are put into the dying state before <i>Second Wind</i> successfully triggers. You lose the <font color='#ffffff'><b>Broken</b></font> status effect.</font><br><br>" + broken + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Yeah, that's a no.&quot; —&#8288;Steve Harrington</i></font>",
                        R.drawable.survivor_second_wind, Arrays.asList("Steve", "Renewal", "Broken", "Healing", "Hook", "Injured"),71),
                new PerkItem("<font color='#ffffff'><b>SELF-CARE</b></font>",
                        "<font color='#aaa9a9'><ul><li>Unlocks the <i>Self-Care</i> ability, which allows you to heal without a Med&#8288;-&#8288;Kit at " +
                                "<font color='#ffff1a'><b>25</font>/<font color='#199b1e'>30</font>/<font color='#ac3ee3'>35</b></font>&nbsp;% normal healing speed.</li></ul></font>",
                        R.drawable.survivor_self_care, Arrays.asList("Claudette", "Healing", "Injured"),23),
                new PerkItem("<font color='#ffffff'><b>SELF-PRESERVATION</b></font>",
                        "<font color='#aaa9a9'>Life's unforgiving. Sometimes it's best to look out for yourself.<br><br>" +
                                "Whenever another Survivor within <font color='#ff8800'><b>16&nbsp;meters</b></font> of you gets hit by a basic attack or a special attack, <i>Self&#8288;-&#8288;Preservation</i> activates." +
                                "<ul><li>Your scratch marks, pools of blood and grunts of pain are hidden for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Something I learned in the industry: when the axe is swinging, keep your head down.&quot; —&#8288;Yun-Jin</i></font>",
                        R.drawable.survivor_self_preservation, Arrays.asList("Yun-Jin", "Chase"),89),
                new PerkItem("<font color='#ffffff'><b>SHOULDER THE BURDEN</b></font>",
                        "<font color='#aaa9a9'>Born to be a disciple. Ready to submit to a greater cause. This is your calling.<br><br>" +
                                "Once per trial, as long as you are not on death hook, press the <i>Ability Button 2</i> in front of a hooked Survivor to unhook them." +
                                "<ul><li>When they are unhooked, they lose 1 hook state and you gain 1 hook state.</li><br>" +
                                "<li>You also scream and gain the <font color='#ffffff'><b>Exposed</b></font> status effect for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.</li></ul></font>" + exposed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;It's not your time yet. Now go on!&quot; —&#8288;Taurie Cain</i></font>",
                        R.drawable.survivor_shoulder_the_burden, Arrays.asList("Taurie", "Exposed", "Hook", "Scream"),149),
                new PerkItem("<font color='#ffffff'><b>SLIPPERY MEAT</b></font>",
                        "<font color='#aaa9a9'>You have developed an efficient way to get off hooks." +
                                "<ul><li>Grants up to <font color='#ff8800'><b>3</b></font> extra escape attempts on the hook.</li><br>" +
                                "<li>Hook escape attempts have a <font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> % increased chance to succeed.</li></ul></font>",
                        R.drawable.survivor_slippery_meat, Arrays.asList("Default", "Hook"),9),
                new PerkItem("<font color='#ffffff'><b>SMALL GAME</b></font>",
                        "<font color='#aaa9a9'>You have the undeniable capability to sense danger." +
                                "<ul><li>Get an auditory warning when looking in the direction of Totems in a <font color='#ff8800'><b>45 degree</b></font> cone within a range of " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>10</font>/<font color='#ac3ee3'>12</b></font> meters.</li><br>" +
                                "<li><i>Small Game</i> has a cooldown of <font color='#ffff1a'><b>14</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>10</b></font> seconds each time it activates.</li><br>" +
                                "<li>For each Dull Totem and Hex Totem cleansed by any player, gain a Token.</li><br>" +
                                "<li><i>Small Game</i>'s detection cone is reduced by <font color='#ff0808'><b>5&nbsp;degrees</b></font> per token.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Nope.&quot; —&#8288;Lost Tapes: Andy</i></font>",
                        R.drawable.survivor_small_game, Arrays.asList("Default", "Totem"),10),
                new PerkItem("<font color='#ffffff'><b>SMASH HIT</b></font>",
                        "<font color='#aaa9a9'>When your rival makes a mistake, you seize the opportunity." +
                                "<ul><li>After stunning the Killer with a pallet, break into a sprint at <font color='#ffff1a'><b>150%</b></font> your normal running speed for <font color='#ff8800'><b>4 seconds</b></font>.</li></ul>" +
                                "Causes the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>20</b></font> seconds.<br><br>" +
                                "This perk cannot be used while <font color='#ffffff'><b>Exhausted</b></font>.</font><br><br>" + exhaustion + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I've dealt with psychopaths in suits. You're just uglier and worse dressed.&quot; —&#8288;Yun&#8288;-&#8288;Jin</i></font>",
                        R.drawable.survivor_smash_hit, Arrays.asList("Yun-Jin", "Exhaustion", "Haste", "Stun"),88),
                new PerkItem("<font color='#ffffff'><b>SOLE SURVIVOR</b></font>",
                        "<font color='#aaa9a9'>As more of your friends fall to the Killer, you become shrouded in isolation and the Killer's aura-reading abilities towards you are disrupted.<br><br>" +
                                "Every time a fellow Survivor is killed or sacrificed, gain a token." +
                                "<ul><li>For each token, your aura cannot be read by The Killer within a max range of " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>22</font>/<font color='#ac3ee3'>24</b></font> meters.</li></ul>" +
                                "When you're the last Survivor alive:" +
                                "<ul><li>Gain <font color='#ffff1a'><b>75%</b></font> action speed when repairing generators.</li><br>" +
                                "<li>Gain <font color='#ff8800'><b>50%</b></font> action speed while opening an exit gate or the Hatch.</li></ul>" +
                                "Increases your chances of being The Killer's Obsession.</font><br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;It was the boogeyman.&quot; —&#8288;Laurie Strode</i></font>",
                        R.drawable.survivor_sole_survivor, Arrays.asList("Laurie", "Exit Gate", "Obsession", "Repairing"),32),
                new PerkItem("<font color='#ffffff'><b>SOLIDARITY</b></font>",
                        "<font color='#aaa9a9'>Sharing painful experiences has the power to heal." +
                                "<ul><li>While injured, healing a Survivor without using a Med-Kit also heals you at a <font color='#ffff1a'><b>50</font>/<font color='#199b1e'>60</font>/<font color='#ac3ee3'>70</b></font> % conversion rate.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Showing up when things get rough, listening to people's problems, and supporting those in need; that's how you become stronger, that's how you grow.&quot; —&#8288;Jane Romero</i></font>",
                        R.drawable.survivor_solidarity, Arrays.asList("Jane", "Healing", "Injured"),62),
                new PerkItem("<font color='#ffffff'><b>SOUL GUARD</b></font>",
                        "<font color='#aaa9a9'>You have been through immense hardship and you're stronger for it." +
                                "<ul><li>Gain the <font color='#ffffff'><b>Endurance</b></font> status effect for " +
                                "<font color='#ffff1a'><b>4</font>/<font color='#199b1e'>6</font>/<font color='#ac3ee3'>8</b></font> seconds after being healed or having recovered from the dying state.</li><br>" +
                                "<li>While cursed by a Hex, you can fully recover from the dying state.</li></ul>" +
                                "This effect can only trigger once every <font color='#ff8800'><b>30 seconds</b></font>.</font><br><br>" + endurance + "<br><br>" + deep_wound,
                        R.drawable.survivor_soul_guard, Arrays.asList("Cheryl", "Endurance", "Slug"),80),
                new PerkItem("<font color='#ffffff'><b>SPECIALIST</b></font>",
                        "<font color='#aaa9a9'>Adventure. Exploration. Excavation. You are in your element.<br><br>" +
                                "Each time you open or rummage through a chest, gain <font color='#ffff1a'><b>1 token</b></font>, up to <font color='#ff8800'><b>6</b></font>.<br><br>" +
                                "When you perform a great Skill Check on a generator, consume <font color='#ff0808'><b>all tokens</b></font>." +
                                "<ul><li>Then, for each token consumed, reduce the maximum required generator progress by " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Well, then. Doesn't this feel familiar?&quot; —&#8288;Lara Croft</i></font>",
                        R.drawable.survivor_specialist, Arrays.asList("Lara", "Item", "Repairing"),143),
                new PerkItem("<font color='#ffffff'><b>SPINE CHILL</b></font>",
                        "<font color='#aaa9a9'>An unnatural tingle warns you of impending doom." +
                                "<ul><li>Get notified when the Killer is looking at you with a clear line of sight within a <font color='#ff8800'><b>36 meter</b></font> range.</li><br>" +
                                "<li>Your speed while repairing, sabotaging, healing, unhooking, cleansing, blessing, opening exit gates and unlocking is increased by " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>6</b></font> %.</li></ul>" +
                                "The effects of <i>Spine Chill</i> linger for <font color='#ff0808'><b>0.5 seconds</b></font> after the Killer looks away or is out of range.</font>",
                        R.drawable.survivor_spine_chill, Arrays.asList("Default", "Exit Gate", "Healing", "Repairing", "Totem"),11),
                new PerkItem("<font color='#ffffff'><b>SPRINT BURST</b></font>",
                        "<font color='#aaa9a9'><ul><li>When starting to run, break into a sprint at <font color='#ffff1a'><b>150%</b></font> of your normal running speed for a maximum of <font color='#ff8800'><b>3&nbsp;seconds</b></font>.</li></ul>" +
                                "Causes the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.<br><br>" +
                                "<i>Sprint Burst</i> cannot be used while <font color='#ffffff'><b>Exhausted</b></font>.</font><br><br>" + exhaustion,
                        R.drawable.survivor_sprint_burst, Arrays.asList("Meg", "Exhaustion", "Haste"),20),
                new PerkItem("<font color='#ffffff'><b>STAKE OUT</b></font>",
                        "<font color='#aaa9a9'>Getting close to the Killer fills you with determination.<br><br>" +
                                "For each <font color='#ffff1a'><b>15 seconds</b></font> you are standing within the Killer Terror Radius and not in a chase, you gain a token up to a maximum of " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> tokens." +
                                "<ul><li>When <i>Stake</i> Out has at least <font color='#ff8800'><b>1&nbsp;token</b></font>, good Skill Checks are considered great Skill Checks, consume <font color='#ff8800'><b>1&nbsp;token</b></font>, and grant an additional " +
                                "<font color='#ff0808'><b>1%</b></font> bonus to generator repair progress.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I had you, I had you on your knees. You're runnin' scared because we had you. We're gonna close this case!&quot; —&#8288;Detective David Tapp</i></font>",
                        R.drawable.survivor_stake_out, Arrays.asList("Detective Tapp", "Repairing"),49),
                new PerkItem("<font color='#ffffff'><b>STILL SIGHT</b></font>",
                        "<font color='#aaa9a9'>A clear mind and calm temperament will always find the means of their escape.<br><br>" +
                                "After standing still for <font color='#ffff1a'><b>6</font>/<font color='#199b1e'>5</font>/<font color='#ac3ee3'>4</b></font> seconds, this perk activates." +
                                "<ul><li>Until you start moving, you see the aura of the Killer as well as all generators and chests within <font color='#ff8800'><b>18&nbsp;meters</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Breathe in. Breathe out. Now open your eyes.&quot; —&#8288;Baermar</i></font>",
                        R.drawable.survivor_still_sight, Arrays.asList("Aestri", "Aura", "Killer Aura"),140),
                new PerkItem("<font color='#ffffff'><b>STREETWISE</b></font>",
                        "<font color='#aaa9a9'>Long nights out taught you to do a lot with what you've got." +
                                "<ul><li>Reduce consumption rate of item charge by " +
                                "<font color='#ffff1a'><b>15</font>/<font color='#199b1e'>20</font>/<font color='#ac3ee3'>25</b></font> % for you and allies within a <font color='#ff8800'><b>8&nbsp;meter</b></font> range.</li></ul>" +
                                "Once out of range, this effect persists for <font color='#ff0808'><b>15&nbsp;seconds</b></font>.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;You're doing it wrong! Let me show you how it's done.&quot; —&#8288;Nea</i></font>",
                        R.drawable.survivor_streetwise, Arrays.asList("Nea", "Item"),28),
                new PerkItem("<font color='#ffffff'><b>STRENGTH IN SHADOWS</b></font>",
                        "<font color='#aaa9a9'>A chance for renewed power down where danger calls home.<br><br>" +
                                "When in the basement, this perk activates." +
                                "<ul><li>Unlocks the <i>Strength in Shadows</i> ability, which allows you to heal without a Med-Kit at <font color='#ff8800'><b>70%</b></font> normal healing speed.</li><br>" +
                                "<li>When you finish a heal in the basement, you see the Killer's aura for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I'm getting out of here, if it's the last thing I do.&quot; —&#8288;Sable</i></font>",
                        R.drawable.survivor_strength_in_shadows, Arrays.asList("Sable", "Healing", "Killer Aura"),136),
                new PerkItem("<font color='#ffffff'><b>TEAMWORK: COLLECTIVE STEALTH</b></font>",
                        "<font color='#aaa9a9'>When someone helps you out, you respond in kind." +
                                "<ul><li>When another Survivor finishes healing you, you both leave no scratch marks as long as you stay within " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>16</b></font> meters of each other.</li></ul>" +
                                "This effect lingers for <font color='#ff8800'><b>4&nbsp;seconds</b></font> when leaving the range.<br><br>" +
                                "This effect does not stack.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;I'm good, I'm good... but keep it down.&quot; —&#8288;Renato Lyra</i></font>",
                        R.drawable.survivor_teamwork_collective_stealth, Arrays.asList("Renato", "Chase", "Healing"),122),
                new PerkItem("<font color='#ffffff'><b>TEAMWORK: POWER OF TWO</b></font>",
                        "<font color='#aaa9a9'>It's hard to keep up with you, but it doesn't stop people from trying." +
                                "<ul><li>When you finish healing another Survivor, you both gain <font color='#ffff1a'><b>5%</b></font> <font color='#ffffff'><b>Haste</b></font> as long as you stay within " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>16</b></font> meters of each other.</li></ul>" +
                                "This effect lingers for <font color='#ff8800'><b>4&nbsp;seconds</b></font> when leaving the range.<br><br>" +
                                "This effect does not stack.</font><br><br>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;You good? Then keep up.&quot; —&#8288;Thalita Lyra</i></font>",
                        R.drawable.survivor_teamwork_power_of_two, Arrays.asList("Thalita", "Chase", "Haste", "Healing"),119),
                new PerkItem("<font color='#ffffff'><b>TECHNICIAN</b></font>",
                        "<font color='#aaa9a9'>You are apt at handling machinery with the greatest care and precision." +
                                "<ul><li>The noises caused by your repairs and their hearing distance are reduced by <font color='#ff8800'><b>8&nbsp;meters</b></font>.</li></ul>" +
                                "On a failed repair Skill Check, the following effects happen:" +
                                "<ul><li>The generator explosion will be prevented.</li><br>" +
                                "<li>The generator loses progress as usual.</li><br>" +
                                "<li>An additional <font color='#ffff1a'><b>5</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>3</b></font> % progress is lost.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I'm gonna stealth this one.&quot; —&#8288;Feng Min</i></font>",
                        R.drawable.survivor_technician, Arrays.asList("Feng", "Repairing"),41),
                new PerkItem("<font color='#ffffff'><b>TENACITY</b></font>",
                        "<font color='#aaa9a9'>There is nothing stopping you." +
                                "<ul><li>Your ferocious tenacity in dire situations allows you to crawl " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>50</b></font>&nbsp;% faster and recover at the same time.</li><br>" +
                                "<li>Grunts of pain while in the dying state are reduced by <font color='#ff8800'><b>75%</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;What the hell is this? I'm taking this bastard down!&quot; —&#8288;Detective David Tapp</i></font>",
                        R.drawable.survivor_tenacity, Arrays.asList("Detective Tapp", "Slug"),50),
                new PerkItem("<font color='#ffffff'><b>THIS IS NOT HAPPENING</b></font>",
                        "<font color='#aaa9a9'>You perform at your best when you are under extreme stress." +
                                "<ul><li>Great Skill Check success zones when repairing and healing get " +
                                "<font color='#ffff1a'><b>10</font>/<font color='#199b1e'>20</font>/<font color='#ac3ee3'>30</b></font>&nbsp;% bigger when you are injured.</li></ul></font>",
                        R.drawable.survivor_this_is_not_happening, Arrays.asList("Default", "Healing", "Injured", "Repairing"),12),
                new PerkItem("<font color='#ffffff'><b>TROUBLESHOOTER</b></font>",
                        "<font color='#aaa9a9'>No amount of distraction will shake you from your primary task.<br><br>" +
                                "When you are chased by the Killer, <i>Troubleshooter</i> activates." +
                                "<ul><li>You see the aura of the Generator with the most progress.</li><br>" +
                                "<li>You see the aura of the Killer for <font color='#ffff1a'><b>4</font>/<font color='#199b1e'>5</font>/<font color='#ac3ee3'>6</b></font>&nbsp;seconds after dropping a Pallet.</li></ul>" +
                                "The effect lasts for <font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font>&nbsp;seconds after being in chase, then deactivates.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Nothing gets done around here if I don't do it.&quot; —&#8288;Gabriel Soma</i></font>",
                        R.drawable.survivor_troubleshooter, Arrays.asList("Gabriel", "Aura", "Chase", "Killer Aura"),123),
                new PerkItem("<font color='#ffffff'><b>UNBREAKABLE</b></font>",
                        "<font color='#aaa9a9'>Past battles have taught you a thing or two about survival." +
                                "<ul><li>Grants the ability to fully recover from the dying state <font color='#ff8800'><b>once per trial</b></font>.</li><br>" +
                                "<li>Increases dying recovery speed by <font color='#ffff1a'><b>25</font>/<font color='#199b1e'>30</font>/<font color='#ac3ee3'>35</b></font>&nbsp;%.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Goddammit, I am seriously FUBAR!&quot; —&#8288;Bill</i></font>",
                        R.drawable.survivor_unbreakable, Arrays.asList("Bill", "Slug"),38),
                new PerkItem("<font color='#ffffff'><b>UP THE ANTE</b></font>",
                        "<font color='#aaa9a9'>All will be well in the end; you just know it. Your confidence strengthens the feeling of hope for those around you." +
                                "<ul><li>For each other Survivor still alive, grant a " +
                                "<font color='#ffff1a'><b>1</font>/<font color='#199b1e'>2</font>/<font color='#ac3ee3'>3</b></font>&nbsp;% bonus of luck to all remaining Survivors.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;What can I say? I'm just a very lucky guy... I'm sure some of it will rub off on you.&quot; —&#8288;Ace</i></font>",
                        R.drawable.survivor_up_the_ante, Arrays.asList("Ace", "Hook"),35),
                new PerkItem("<font color='#ffffff'><b>URBAN EVASION</b></font>",
                        "<font color='#aaa9a9'>Years of evading the cops taught you a thing or two about stealth." +
                                "<ul><li>Your movement speed while crouching is increased by " +
                                "<font color='#ffff1a'><b>90</font>/<font color='#199b1e'>95</font>/<font color='#ac3ee3'>100</b></font>&nbsp;%.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;The paint is still fresh but I'm long gone.&quot; —&#8288;Nea</i></font>",
                        R.drawable.survivor_urban_evasion, Arrays.asList("Nea", "Chase"),29),
                new PerkItem("<font color='#ffffff'><b>VIGIL</b></font>",
                        "<font color='#aaa9a9'>You look over your friends even in dire situations." +
                                "<ul><li>You and your allies within a <font color='#ff8800'><b>8 meter</b></font> range recover from the <font color='#ffffff'><b>Blindness</b></font>, <font color='#ffffff'><b>Broken</b></font>, <font color='#ffffff'><b>Exhausted</b></font>, " +
                                "<font color='#ffffff'><b>Exposed</b></font>, <font color='#ffffff'><b>Hemorrhage</b></font>, <font color='#ffffff'><b>Hindered</b></font>, <font color='#ffffff'><b>Mangled</b></font>, <font color='#ffffff'><b>Oblivious</b></font> status effects " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font>&nbsp;% faster.</li></ul>" +
                                "Once out of range, this effect persists for <font color='#ff0808'><b>15&nbsp;seconds</b></font>.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;I'm gonna be here when you wake up. You're gonna make it.&quot; —&#8288;Quentin Smith</i></font>",
                        R.drawable.survivor_vigil, Arrays.asList("Quentin", "Blindness", "Broken", "Exhaustion", "Exposed"),46),
                new PerkItem("<font color='#ffffff'><b>VISIONARY</b></font>",
                        "<font color='#aaa9a9'>You're remarkably focused on your means of escape." +
                                "<ul><li>You see generator's auras within <font color='#ff8800'><b>32 meters</b></font>.</li></ul>" +
                                "Anytime a generator is completed, <i>Visionary</i> is disabled for " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>18</font>/<font color='#ac3ee3'>16</b></font>&nbsp;seconds.</font>",
                        R.drawable.survivor_visionary, Arrays.asList("Felix", "Aura"),83),
                new PerkItem("<font color='#ffffff'><b>WAKE UP!</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>Once all generators are powered, exit gates are revealed to you within a <font color='#ff8800'><b>128 meter</b></font> range.</li><br>" +
                                "<li>While opening the exit gates, reveal your aura to other Survivors up to <font color='#ff0808'><b>128 meters</b></font>.</li><br>" +
                                "<li>While <i>Wake Up!</i> is active, open the exit gates " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>10</font>/<font color='#ac3ee3'>12.5</b></font>&nbsp;% faster for each Survivor still alive.</li></ul></font>",
                        R.drawable.survivor_wake_up, Arrays.asList("Quentin", "Aura", "End Game", "Exit Gate"),47),
                new PerkItem("<font color='#ffffff'><b>WE'LL MAKE IT</b></font>",
                        "<font color='#aaa9a9'>Helping others heightens your morale." +
                                "<ul><li>When you rescue a Survivor from a hook, gain a <font color='#ff8800'><b>100%</b></font> speed increase while healing others for " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>60</font>/<font color='#ac3ee3'>90</b></font>&nbsp;seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I'm confident we can all escape in one piece if we help each other.&quot;</i></font>",
                        R.drawable.survivor_well_make_it, Arrays.asList("Default", "Healing", "Hook"),13),
                new PerkItem("<font color='#ffffff'><b>WE'RE GONNA LIVE FOREVER</b></font>",
                        "<font color='#aaa9a9'>Your few friends deserve the best protection." +
                                "<ul><li>When healing another Survivor in the dying state, your healing speed is increased by " +
                                "<font color='#ff8800'><b>100%</b></font>.</li><br>" +
                                "<li>Once healing is complete, the healed Survivor gains the <font color='#ffffff'><b>Endurance</b></font> status effect for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font>&nbsp;seconds.</li></ul>" +
                                "This effect has a <font color='#ff0808'><b>30&nbsp;second</b></font> cooldown.</font><br><br>" + endurance + "<br><br>" + deep_wound + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Come on then, let's ‘ave it! I don't give a shit pal.&quot; —&#8288;David King</i></font>",
                        R.drawable.survivor_were_gonna_live_forever, Arrays.asList("David", "Endurance", "Healing", "Slug"),44),
                new PerkItem("<font color='#ffffff'><b>WICKED</b></font>",
                        "<font color='#aaa9a9'>They can try to hurt you. But you're not going down so easily." +
                                "<ul><li>Your self-unhook attempts in the basement always succeed.</li><br>" +
                                "<li>When you are unhooked or unhook yourself, you see the Killer's aura for " +
                                "<font color='#ffff1a'><b>16</font>/<font color='#199b1e'>18</font>/<font color='#ac3ee3'>20</b></font>&nbsp;seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;I haven't let anyone get in my way before. You think I'm gonna start now?&quot; —&#8288;Sable</i></font>",
                        R.drawable.survivor_wicked, Arrays.asList("Sable", "Hook", "Killer Aura"),137),
                new PerkItem("<font color='#ffffff'><b>WINDOWS OF OPPORTUNITY</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>Auras of pallets, breakable walls, and vault locations are revealed to you when within a " +
                                "<font color='#ffff1a'><b>16</font>/<font color='#199b1e'>18</font>/<font color='#ac3ee3'>20</b></font> meter range.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Rise and shine, work hard, carve out your name,<br>" +
                                "Take aim, pull the trigger, hit the bulls eye for fame,<br>" +
                                "Know the value of faith, an' family, and don't you complain,<br>" +
                                "Open wide, your windows of opportunity.&quot;<br>—&#8288;Kate Denson's &quot;Windows of Opportunity&quot;",
                        R.drawable.survivor_windows_of_opportunity, Arrays.asList("Kate", "Aura", "Chase"),53),
                new PerkItem("<font color='#ffffff'><b>WIRETAP</b></font>",
                        "<font color='#aaa9a9'>You know that the best way to stay one step ahead is to keep tabs on the competition.<br><br>" +
                                "<i>Wiretap</i> activates after completing a total of <font color='#ff8800'><b>40%</b></font> worth of repair progress on generators.<br><br>" +
                                "When standing next to a generator, press the <i>Active Ability Button 2</i> to install a <i>Wiretap</i>, which stays active for " +
                                "<font color='#ffff1a'><b>100</font>/<font color='#199b1e'>110</font>/<font color='#ac3ee3'>120</b></font> seconds.<br><br>" +
                                "Affected generators will be revealed to all Survivors by a yellow aura.<br><br>" +
                                "Only one <i>Wiretap</i> can be active on a generator." +
                                "<ul><li>When the Killer enters within <font color='#ff0808'><b>14 meters</b></font> of the generator, their aura is revealed to all Survivors.</li></ul>" +
                                "<i>Wiretap</i> deactivates when the generator is damaged by the Killer or when the timer expires.</font>",
                        R.drawable.survivor_wiretap, Arrays.asList("Ada", "Killer Aura"),108)
        );
    }
}