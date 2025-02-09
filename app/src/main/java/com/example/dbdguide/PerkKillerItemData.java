package com.example.dbdguide;

import java.util.Arrays;
import java.util.List;

public class PerkKillerItemData {



    // Static method to return a list of ButtonItems
    public static List<PerkItem> getButtonItems() {

        String blindness = "<font color='#e7daa2'><i>Blindness prevents Survivors from seeing auras.</i></font>";
        String broken = "<font color='#e7daa2'><i>Broken prevents Survivors from being healed.</i></font>";
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
                new PerkItem("<font color='#ffffff'><b>A NURSE'S CALLING</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability.<br>" +
                                "<ul><li>The auras of Survivors who are healing or being healed are revealed to you when they are within a " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>24</font>/<font color='#ac3ee3'>28</b></font> meter range.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Still attached to the fragments of her past life, she is drawn to those in need of help.&quot;</i></font>",
                        R.drawable.killer_a_nurses_calling, Arrays.asList("Nurse", "Aura", "Healing"),22),
                new PerkItem("<font color='#ffffff'><b>AGITATION</b></font>",
                        "<font color='#aaa9a9'>You get excited in anticipation of hooking your prey.<br>" +
                                "<ul><li>Increases your movement speed while transporting bodies by <font color='#ffff1a'><b>6</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>18</b></font> %. " +
                                "While transporting a body, your Terror Radius is increased by <font color='#ff8800'><b>12 meters</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;At some point, the excitement of hooking one of us becomes more important than the desire to kill us.&quot;</i></font>",
                        R.drawable.killer_agitation, Arrays.asList("Trapper", "Carrying", "Haste", "Terror Radius"), 13),
                new PerkItem("<font color='#ffffff'><b>ALIEN INSTINCT</b></font>",
                        "<font color='#aaa9a9'>You are so stealthy, sometimes it seems like you appear out of nowhere.<br><br>" +
                                "This perk activates when you hook a Survivor." +
                                "<ul><li>You see the aura of the farthest injured Survivor for <font color='#ff8800'><b>5 seconds</b></font> and that Survivor is <font color='#ffffff'><b>Oblivious</b></font> for " +
                                "<font color='#ffff1a'><b>16</font>/<font color='#199b1e'>18</font>/<font color='#ac3ee3'>20</b></font> seconds.</li></ul></font>" +
                                oblivious + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Yellow light's for my eyes only.&quot; —&#8288;Dallas</i></font>",
                        R.drawable.killer_alien_instinct, Arrays.asList("Xenomorph", "Aura", "Hook", "Oblivious"), 112),
                new PerkItem("<font color='#ffffff'><b>ALL-SHAKING THUNDER</b></font>",
                        "<font color='#aaa9a9'>Enemies on land and sea learned to tremble before your might." +
                                "<ul><li>After you fall from a height, your lunge attack distance is increased by <font color='#ff8800'><b>75%</b></font> for " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>16</b></font> seconds.</li></ul>" +
                                "This perk has a <font color='#ff0808'><b>5 second</b></font> cooldown.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Go on. Run. Tell your friends I'm coming for them.&quot; —&#8288;Portia Maye</i></font>",
                        R.drawable.killer_all_shaking_thunder, Arrays.asList("Houndmaster", "Chase"), 125),
                new PerkItem("<font color='#ffffff'><b>AWAKENED AWARENESS</b></font>",
                        "<font color='#aaa9a9'>Your genes have been altered to heighten your senses in intense situations." +
                                "<ul><li>When carrying a Survivor, you can see the aura of other Survivors within " +
                                "<font color='#ffff1a'><b>16</font>/<font color='#199b1e'>18</font>/<font color='#ac3ee3'>20</b></font> meters of your position.</li></ul></font>",
                        R.drawable.killer_awakened_awareness, Arrays.asList("Mastermind", "Aura", "Carrying"), 99),
                new PerkItem("<font color='#ffffff'><b>BAMBOOZLE</b></font>",
                        "<font color='#aaa9a9'><ul><li>Your vault speed is <font color='#ffff1a'><b>5</font>/<font color='#199b1e'>10</font>/<font color='#ac3ee3'>15</b></font> % faster.</li><br>" +
                                "<li>Performing a vault action calls upon the Entity to block that vault location to Survivors for " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>16</b></font> seconds.</li></ul>" +
                                "Only 1 vault location may be blocked in this way at any time.<br><br>" +
                                "Does not affect pallets.",
                        R.drawable.killer_bamboozle, Arrays.asList("Clown", "Chase"), 46),
                new PerkItem("<font color='#ffffff'><b>BARBECUE & CHILI</b></font>",
                        "<font color='#aaa9a9'>A deep bond with The Entity unlocks potential in one's aura reading ability." +
                                "<ul><li>After hooking a Survivor, all other Survivors' auras are revealed to you for <font color='#ff8800'><b>5 seconds</b></font> when they are further than " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> meters from the hook.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;I just can't take no pleasure in killing. There's just some things you gotta do. Don't mean you have to like it.&quot; —&#8288;Drayton Sawyer</i></font>",
                        R.drawable.killer_barbecue_and_chili, Arrays.asList("Cannibal", "Aura", "Hook"), 37),
                new PerkItem("<font color='#ffffff'><b>BATTERIES INCLUDED</b></font>",
                        "<font color='#aaa9a9'>Being somewhere between man and machine has its upsides." +
                                "<ul><li>When within <font color='#ffff1a'><b>12 meters</b></font> of a completed generator, you have <font color='#ff8800'><b>5%</b></font> <font color='#ffffff'><b>Haste</b></font>.</li></ul>" +
                                "The movement speed bonus lingers for <font color='#ffff1a'><b>1</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>5</b></font> seconds after leaving the generator's range.<br><br>" +
                                haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Surprise! Did you miss me, Andy?&quot; —&#8288;Chucky</i></font>",
                        R.drawable.killer_batteries_included, Arrays.asList("Good Guy", "Chase", "Haste"), 115),
                new PerkItem("<font color='#ffffff'><b>BEAST OF PREY</b></font>",
                        "<font color='#aaa9a9'>Your lust for a kill is so intense that your connection with The Entity is momentarily lost, making you totally unpredictable." +
                                "<ul><li>Grants the <font color='#ffffff'><b>Undetectable</b></font> status effect after gaining Bloodlust Tier I. The status effect is removed once you lose Bloodlust.</li><br>" +
                                "<li>Gain <font color='#ffff1a'><b>30</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>50</b></font> % more Bloodpoints for actions in the Hunter Category.</li></ul></font>" +
                                undetectable + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Where did she go?&quot;</i></font>",
                        R.drawable.killer_beast_of_prey, Arrays.asList("Huntress", "Chase", "Undetectable"), 34),
                new PerkItem("<font color='#ffffff'><b>BITTER MURMUR</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>Each time a generator is fully repaired, Survivors within <font color='#ffff1a'><b>16 meters</b></font> of the completed generator will be revealed for " +
                                "<font color='#ff8800'><b>5 seconds</b></font>.</li></br>" +
                                "When the last generator is fully repaired, all the Survivors' aura are revealed for " +
                                "<font color='#ffff1a'><b>5</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>10</b></font> seconds.",
                        R.drawable.killer_bitter_murmur, Arrays.asList("Default", "Aura"), 1),
                new PerkItem("<font color='#ffffff'><b>BLOOD ECHO</b></font>",
                        "<font color='#aaa9a9'>The agony of one is inflicted on others." +
                                "<ul><li>When hooking a Survivor, all injured Survivors suffer from the <font color='#ffffff'><b>Hemorrhage</b></font> and <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> seconds.</li></ul></font>" +
                                exhaustion + "<br><br>" + hemorrhage + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Attack an enemy with precision and their allies will feel it.&quot; —&#8288;Renjiro's Doctrine 6:3</i></font>",
                        R.drawable.killer_blood_echo, Arrays.asList("Oni", "Healing", "Hemorrhage", "Hook", "Exhaustion"), 64),
                new PerkItem("<font color='#ffffff'><b>BLOOD WARDEN</b></font>",
                                "<font color='#aaa9a9'>As soon as an exit gate is opened, Blood Warden is activated." +
                                "<ul><li>The auras of Survivors located within Exit areas are revealed to you.</li></br>" +
                                "<li>Once per match, hooking a Survivor while Blood Warden is active calls upon The Entity to block both Exits for all Survivors for " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;This is my world. And you can't ever leave.&quot; —&#8288;Freddy Krueger</i></font>",
                        R.drawable.killer_blood_warden, Arrays.asList("Nightmare", "Aura", "End Game"), 40),
                new PerkItem("<font color='#ffffff'><b>BLOODHOUND</b></font>",
                        "<font color='#aaa9a9'>Like a hunting scent hound, you smell traces of blood at a great distance." +
                                "<ul><li>Fresh blood marks are <font color='#ff8800'><b>considerably</b></font> more discernible than normal and can be tracked for " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> seconds longer than normal.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Pebbles shimmering in the moonlight; my life drips down in a trail so easy to follow.&quot;</i></font>",
                        R.drawable.killer_bloodhound, Arrays.asList("Wraith", "Chase"), 16),
                new PerkItem("<font color='#ffffff'><b>BRUTAL STRENGTH</b></font>",
                        "<font color='#aaa9a9'>Your great strength allows you to shred through your prey's defenses." +
                                "<ul></li>Destroy dropped pallets, breakable walls, and generators " +
                                "<font color='#ffff1a'><b>10</font>/<font color='#199b1e'>15</font>/<font color='#ac3ee3'>20</b></font> % faster.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;It's more than muscles. A dark power motivates the beast.&quot;</i></font>",
                        R.drawable.killer_brutal_strength, Arrays.asList("Trapper", "Chase"), 14),
                new PerkItem("<font color='#ffffff'><b>CALL OF BRINE</b></font>",
                        "<font color='#aaa9a9'>Your psychic abilities influence technology in devastating ways.<br><br>" +
                                "After damaging a generator this perk becomes active for <font color='#ff8800'><b>60 seconds</b></font>." +
                                "<ul><li>The generator regresses at <font color='#ffff1a'><b>115</font>/<font color='#199b1e'>120</font>/<font color='#ac3ee3'>125</b></font> % of the normal regression speed and you can see its aura in yellow.</li></ul>" +
                                "Each time a Survivor completes a good Skill Check on a generator affected by this perk, you receive a loud noise notification.",
                        R.drawable.killer_call_of_brine, Arrays.asList("Onryō", "Chase"), 92),
                new PerkItem("<font color='#ffffff'><b>CORRUPT INTERVENTION</b></font>",
                        "<font color='#aaa9a9'>Your prayers invoke a dark power that meddles with the Survivors' chances of survival." +
                                "<ul><li><font color='#ffff1a'><b>3 generators</b></font> located furthest from you are blocked by The Entitiy for " +
                                "<font color='#ffff1a'><b>80</font>/<font color='#199b1e'>100</font>/<font color='#ac3ee3'>120</b></font> seconds at the start of the trial.<br><br>" +
                                "Survivors cannot repair these generators for the duration. Affected generators are highlighted by a white aura.</li></ul>" +
                                "<i>Corrupt Intervention</i> deactivates when any Survivor enters the dying state.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;It shall be known across the land that the Gods curse the unfaithful.&quot; —&#8288;(The Tablet of Adiris, 3.7.)</i></font>",
                        R.drawable.killer_corrupt_intervention, Arrays.asList("Plague", "Gen Defense"), 55),
                new PerkItem("<font color='#ffffff'><b>COULROPHOBIA</b></font>",
                        "<font color='#aaa9a9'>Even those without a fear of clowns know to be terrified of you." +
                                "<ul><li>Survivors within your Terror Radius have a <font color='#ffff1a'><b>30</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>50</b></font> % penalty to healing progression speed, and healing Skill Checks move " +
                                "<font color='#ff8800'><b>50%</b></font> faster.",
                        R.drawable.killer_coulrophobia, Arrays.asList("Clown", "Healing"), 47),
                new PerkItem("<font color='#ffffff'><b>COUP DE GRÂCE</b></font>",
                        "<font color='#aaa9a9'>At the end, you go in for the kill.<br><br>" +
                                "Each time a generator is completed, Coup de Grâce grows in power. Gain " +
                                "<font color='#ffff1a'><b>2 tokens</b></font>, with a maximum of " +
                                "<font color='#ff8800'><b>5 tokens</b></font> maximum." +
                                "<ul><li>Consume one token to increase the distance of your next lunge attack by " +
                                "<font color='#ffff1a'><b>70</font>/<font color='#199b1e'>75</font>/<font color='#ac3ee3'>80</b></font> %.",
                        R.drawable.killer_coup_de_grace, Arrays.asList("Twins", "Chase"), 78),
                new PerkItem("<font color='#ffffff'><b>CRUEL LIMITS</b></font>",
                        "<font color='#aaa9a9'>Your ties to the otherworldly manifest when you prey attempts to get away." +
                                "<ul><li>Each time a generator is completed, all windows and vault locations are blocked for all Survivors for the next " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> seconds.</li></ul>" +
                                "You see the aura of the vault locations blocked by <i>Cruel Limits</i> for the duration.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;The specimen seems to be able to perform some kind of telekinesis that impacts the state of nearby objects, as if they existed in some other form within a dimension alternate to our own.&quot; —&#8288;Hawkins National Laboratory</i></font>",
                        R.drawable.killer_cruel_limits, Arrays.asList("Demogorgon", "Claustrophobia", "Chase"), 61),
                new PerkItem("<font color='#ffffff'><b>DARK ARROGANCE</b></font>",
                        "<font color='#aaa9a9'>When everything is going right, you are an inescapable inevitability." +
                                "<ul><li>Increases the duration you are blinded by any means and the duration of pallet stuns by <font color='#ff8800'><b>25%</b></font>.</li><br>" +
                                "<li>Increases regular vault speed by <font color='#ffff1a'><b>15</font>/<font color='#199b1e'>20</font>/<font color='#ac3ee3'>25</b></font> %.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Run all you want. I will not be denied.&quot; —&#8288;Vecna</i></font>",
                        R.drawable.killer_dark_arrogance, Arrays.asList("Lich", "Chase"), 121),
                new PerkItem("<font color='#ffffff'><b>DARK DEVOTION</b></font>",
                        "<font color='#aaa9a9'>The display of your powers creates a whirlwind of panic that spreads throughout the land." +
                                "<ul><li>You become obsessed with one Survivor. When the Survivor loses a health state, your Terror Radius transfers to the Obsession for " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> seconds, and its radius is set to <font color='#ff8800'><b>32 meters</b></font>.</li><br>" +
                                "<li>You are granted the <font color='#ffffff'><b>Undetectable</b></font> status effect for the duration.</li></ul>" +
                                "The Survivor with the transferred Terror Radius is also considered to be &quot;inside the Terror Radius&quot; for other purposes.</font><br><br>" + obsessed + "<br><br>" + undetectable +
                                "<br><br><font color='#eeddbe'><i>&quot;And terror shall take hold of a defiant non-believer, who shall falsely announce my arrival.&quot; —&#8288;(The Tablet of Adiris, 48.9)</i></font>",
                        R.drawable.killer_dark_devotion, Arrays.asList("Plague", "Obsession", "Terror Radius", "Undetectable"), 56),
                new PerkItem("<font color='#ffffff'><b>DARKNESS REVEALED</b></font>",
                        "<font color='#aaa9a9'>In your presence, places once thought to be safe are perhaps the most dangerous." +
                                "<ul><li>When you search a locker, the auras of all Survivors within <font color='#ff8800'><b>8 meters</b></font> of any lockers are revealed to you for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>8</b></font> seconds.</li></ul>" +
                                "<i>Darkness Revealed</i> has a cooldown of <font color='#ff0808'><b>30 seconds</b></font>.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Stay in the light, my children. In darkness, your fear will expose you.&quot; —&#8288;Otto Stamper</i></font>",
                        R.drawable.killer_darkness_revealed, Arrays.asList("Dredge", "Aura"), 95),
                new PerkItem("<font color='#ffffff'><b>DEAD MAN'S SWITCH</b></font>",
                        "<font color='#aaa9a9'>When you hook a Survivor, <i>Dead Man's Switch</i> activates." +
                                "<ul><li>The first Survivor that stops repairing a generator causes The Entity to block it for " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>45</font>/<font color='#ac3ee3'>50</b></font> seconds.</li></ul>" +
                                "The affected generator is highlighted by a white aura.<br><br>" +
                                "<i>Dead Man's Switch</i> cannot reactivate while it is blocking a generator.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I've seen the look on a man's face when he realizes he's going to die.&quot; —&#8288;Caleb Quinn</i></font>",
                        R.drawable.killer_dead_mans_switch, Arrays.asList("Deathslinger", "Gen Defense", "Hook"), 67),
                new PerkItem("<font color='#ffffff'><b>DEADLOCK</b></font>",
                        "<font color='#aaa9a9'>You induce mental suffering by crushing any hope of escape." +
                                "<ul><li>After a generator is repaired, The Entity blocks the generator with the most progress for " +
                                "<font color='#ffff1a'><b>15</font>/<font color='#199b1e'>20</font>/<font color='#ac3ee3'>25</b></font> seconds. You see its white aura during this time.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Nobody escapes us.&quot; —&#8288;Pinhead</i></font>",
                        R.drawable.killer_deadlock, Arrays.asList("Cenobite", "Gen Defense"), 85),
                new PerkItem("<font color='#ffffff'><b>DEATHBOUND</b></font>",
                        "<font color='#aaa9a9'>Those whose lives are intertwined in darkness are destined to suffer together." +
                                "<ul><li>When a Survivor heals another Survivor, they scream and activate <i>Deathbound</i>. When the healer is farther than " +
                                "<font color='#ffff1a'><b>16</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>8</b></font> meters away from the Survivor they healed, they suffer from the " +
                                "<font color='#ffffff'><b>Oblivious</b></font> status effect. This lasts until the healer loses a health state.<br><br>" + oblivious,
                        R.drawable.killer_deathbound, Arrays.asList("Executioner", "Healing", "Oblivious", "Scream"), 70),
                new PerkItem("<font color='#ffffff'><b>DEERSTALKER</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability. Reveals dying Survivors' auras when standing with a " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>28</font>/<font color='#ac3ee3'>36</b></font> meter range.",
                        R.drawable.killer_deerstalker, Arrays.asList("Default", "Aura", "Slug"), 2),
                new PerkItem("<font color='#ffffff'><b>DISCORDANCE</b></font>",
                        "<font color='#aaa9a9'><ul><li>Any generator within a range of <font color='#ffff1a'><b>64</font>/<font color='#199b1e'>96</font>/<font color='#ac3ee3'>128</b></font> meters " +
                                "that is being repaired by two or more Survivors is marked by a yellow aura.</li><br>" +
                                "<li>When the generator is first highlighted, <i>Discordance</i> triggers a loud noise notification on the generator.</li></ul>" +
                                "After the generator is no longer within range or is no longer being repaired by two or more Survivors, the aura remains for another <font color='#ff8800'><b>4 seconds</b></font>.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Smartasses get killed. We always see to that.&quot; —&#8288;The Legion</i></font>",
                        R.drawable.killer_discordance, Arrays.asList("Legion", "Aura", "Gen Defense"), 52),
                new PerkItem("<font color='#ffffff'><b>DISSOLUTION</b></font>",
                        "<font color='#aaa9a9'>Everything turns to dust. It is as inescapable as the coming of the night." +
                                "<ul><li><font color='#ff8800'><b>3 seconds</b></font> after injuring a Survivor by any means, <i>Dissolution</i> activates for " +
                                "<font color='#ffff1a'><b>12</font>/<font color='#199b1e'>16</font>/<font color='#ac3ee3'>20</b></font> seconds. While <i>Dissolution</i> is active, if a Survivor fast vaults over a pallet " +
                                "inside of your Terror Radius, The Entity will break the pallet at the end of the vault, and <i>Dissolution</i> deactivates.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;The Garden shall be a place of perfect Joy; through Joy, nothing shall stand in our way.&quot; —&#8288;Otto Stamper</i></font>",
                        R.drawable.killer_dissolution, Arrays.asList("Dredge", "Chase"), 94),
                new PerkItem("<font color='#ffffff'><b>DISTRESSING</b></font>",
                        "<font color='#aaa9a9'>Your horrifying emanation strikes at a supernaturally long distance." +
                                "<ul><li>Your Terror Radius is increased by <font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font>&nbsp;%.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Bask in their fear.&quot;</i></font>",
                        R.drawable.killer_distressing, Arrays.asList("Default", "Terror Radius"), 3),
                new PerkItem("<font color='#ffffff'><b>DOMINANCE</b></font>",
                        "<font color='#aaa9a9'>The power you wield over the land strikes terror in the hearts of all who cross your path." +
                                "<ul><li>The first time each totem and each chest is interacted with by a Survivor, that totem or chest is blocked by The Entity for " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>16</b></font> seconds.</li></ul>" +
                                "The auras of blocked totems and chests are revealed to you in white.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Tragic, is it not? How powerless you must feel.&quot; —&#8288;Dracula</i></font>",
                        R.drawable.killer_dominance, Arrays.asList("Dark Lord", "Aura"), 124),
                new PerkItem("<font color='#ffffff'><b>DRAGON'S GRIP</b></font>",
                        "<font color='#aaa9a9'><ul><li>After damaging a generator, for the next <font color='#ffff1a'><b>30 seconds</b></font>, the first Survivor that interacts with it will scream, revealing their location for " +
                                "<font color='#ff8800'><b>4 seconds</b></font> and becoming afflicted with the <font color='#ffffff'><b>Exposed</b></font> status effect for <font color='#ff0808'><b>60 seconds</b></font>.</li></ul>" +
                                "<i>Dragon's Grip</i> has a cooldown of <font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.<br><br>" + exposed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Such potential in this compound... even the slightest trace causes unnatural effects.&quot; —&#8288;Journal of Talbot Grimes</i></font>",
                        R.drawable.killer_dragons_grip, Arrays.asList("Blight", "Exposed", "Scream"), 73),
                new PerkItem("<font color='#ffffff'><b>DYING LIGHT</b></font>",
                        "<font color='#aaa9a9'>You become obsessed with one Survivor." +
                                "<ul><li>Your Obsession gains a <font color='#ff8800'><b>33%</b></font> action speed bonus to unhooking and healing other Survivors.</li><br>" +
                                "<li>Each time you hook a Survivor other than the Obsession, if the Obsession is alive, gain a token.</li><br>" +
                                "<li>If the Obsession is alive, all Survivors who are not the Obsession get " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>2.5</font>/<font color='#ac3ee3'>3</b></font> % penalty to repair, healing and sabotage speeds for each token.</li></ul>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;This isn't a man...&quot; —&#8288;Dr.&nbsp;Sam&nbsp;Loomis</i></font>",
                        R.drawable.killer_dying_light, Arrays.asList("Shape", "Gen Defense", "Healing", "Hook"), 25),
                new PerkItem("<font color='#ffffff'><b>ENDURING</b></font>",
                        "<font color='#aaa9a9'>You are resilient to pain." +
                                "<ul><li>You reduce the duration of pallet stuns by " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>45</font>/<font color='#ac3ee3'>50</b></font> %. Has no effect while carrying a Survivor.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;He stops at nothing.&quot;</i></font>",
                        R.drawable.killer_enduring, Arrays.asList("Hillbilly", "Chase"), 19),
                new PerkItem("<font color='#ffffff'><b>ERUPTION</b></font>",
                        "<font color='#aaa9a9'>The NE-α parasite provides you with the intelligence and awareness needed to set a trap.<br><br>" +
                                "After kicking a generator, its aura is highlighted in yellow." +
                                "<ul><li>Whenever a Survivor enters the dying state, every affected generator explodes, losing <font color='#ff8800'><b>10%</b></font> worth of progress, and starts to regress.</li><br>" +
                                "<li>Any Survivor repairing a generator when it explodes will scream and reveal their aura for " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>10</font>/<font color='#ac3ee3'>12</b></font> seconds.</li></ul>" +
                                "Eruption has a cooldown of <font color='#ff0808'><b>30 seconds</b></font>.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;It can use weapons?&quot; —&#8288;Jill&nbsp;Valentine</i></font>",
                        R.drawable.killer_eruption, Arrays.asList("Nemesis", "Aura", "Gen Defense", "Scream", "Slug"), 84),
                new PerkItem("<font color='#ffffff'><b>FIRE UP</b></font>",
                        "<font color='#aaa9a9'>The increased pressure of losing your prey fills you with anger and gives you unsuspected motivation.<br><br>" +
                                "Each time the Survivors complete repairs on a generator, <i>Fire Up</i> grows in power." +
                                "<ul><li>For each generator completed, gain a <font color='#ffff1a'><b>3</font>/<font color='#199b1e'>3.5</font>/<font color='#ac3ee3'>4</b></font> % stackable buff that grants a speed bonus to " +
                                "picking up, dropping, vaulting, damaging generators, and breaking pallets and breakable walls for the remainder of the trial.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Now why don't you just fucking die?&quot; —&#8288;Freddy Krueger</i></font>",
                        R.drawable.killer_fire_up, Arrays.asList("Nightmare", "Chase"), 41),
                new PerkItem("<font color='#ffffff'><b>FORCED HESITATION</b></font>",
                        "<font color='#aaa9a9'>You have learned the emotional weaknesses of the organics, and how to exploit them." +
                                "<ul><li>When a Survivor is put into the dying state by any means, all other Survivors standing within a <font color='#ffff1a'><b>16 meter</b></font> " +
                                "range around them suffer from the <font color='#ffffff'><b>Hindered</b></font> status effect for <font color='#ff8800'><b>10 seconds</b></font>, reducing their movement speed by <font color='#ff0808'><b>20%</b></font>.</li></ul>" +
                                "This perk goes on cooldown for <font color='#ffff1a'><b>40</font>/<font color='#199b1e'>35</font>/<font color='#ac3ee3'>30</b></font> seconds.<br><br>" + hindered + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;THE ORGANIC MIND'S CAPACITY FOR EMPATHY GOES BEYOND HINDRANCE.&quot; —&#8288;HUX-A7-13</i></font>",
                        R.drawable.killer_forced_hesitation, Arrays.asList("Singularity", "Chase", "Hindered", "Slug"), 108),
                new PerkItem("<font color='#ffffff'><b>FORCED PENANCE</b></font>",
                        "<font color='#aaa9a9'>Those who stand in the way of duty will suffer harsh judgment." +
                                "<ul><li>Survivors who take a protection hit are inflicted with the <font color='#ffffff'><b>Broken</b></font> status effect for " +
                                "<font color='#ffff1a'><b>60</font>/<font color='#199b1e'>70</font>/<font color='#ac3ee3'>80</b></font> seconds.</li></ul>" + broken,
                        R.drawable.killer_forced_penance, Arrays.asList("Executioner", "Broken"), 71),
                new PerkItem("<font color='#ffffff'><b>FRANKLIN'S DEMISE</b></font>",
                        "<font color='#aaa9a9'><ul><li>Your basic attacks make Survivors drop their item on impact. While on the ground, it takes up to " +
                                "<font color='#ffff1a'><b>150</font>/<font color='#199b1e'>120</font>/<font color='#ac3ee3'>90</b></font> seconds for the item to lose all of its charges if it is not picked up.</li><br>" +
                                "<li>Reveal items on the ground within <font color='#ff8800'><b>32 meters</b></font> with a white aura. The Aura will slowly fade to red until the Item is empty of charges.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Sally, I hear something. Stop! Stop!&quot; —&#8288;Franklin</i></font>",
                        R.drawable.killer_franklins_demise, Arrays.asList("Cannibal", "Aura"), 38),
                new PerkItem("<font color='#ffffff'><b>FRIENDS 'TIL THE END</b></font>",
                        "<font color='#aaa9a9'>You'll kill anyone who gets between you and your target.<br><br>" +
                                "You become obsessed with one Survivor." +
                                "<ul><li>When you hook a Survivor that is not the Obsession, the Obsession becomes <font color='#ffffff'><b>Exposed</b></font> for <font color='#ff8800'><b>20 seconds</b></font> and reveals their aura for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>8</b></font> seconds.</li><br>" +
                                "<li>When you hook the Obsession, another random Survivor screams and reveals their position and becomes the Obsession.</li></ul>" + obsessed + "<br><br>" + exposed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I got some fresh meat lined up, and I'm not gonna let you spoil it, not this time!&quot; —&#8288;Chucky</i></font>",
                        R.drawable.killer_friends_til_the_end, Arrays.asList("Good Guy", "Aura", "Exposed", "Hook", "Obsession", "Scream"), 114),
                new PerkItem("<font color='#ffffff'><b>FURTIVE CHASE</b></font>",
                        "<font color='#aaa9a9'>You lurk in the shadows, eliminating your victims one by one.<br><br>" +
                                "You become obsessed with one Survivor." +
                                "<ul><li>When your Obsession is hooked, gain the <font color='#ffffff'><b>Undetectable</b></font> status effect and a <font color='#ff8800'><b>5%</b></font> <font color='#ffffff'><b>Haste</b></font> status effect for " +
                                "<font color='#ffff1a'><b>14</font>/<font color='#199b1e'>16</font>/<font color='#ac3ee3'>18</b></font> seconds.</li><br>" +
                                "<li>When a Survivor rescues the Obsession from a hook, the rescuer becomes the Obsession.</li></ul>" + obsessed + "<br><br>" + undetectable + "<br><br>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;You have no idea what I have planned for you. It'll be in the news for weeks: I'll make sure of it.&quot; —&#8288;The Ghost Face</i></font>",
                        R.drawable.killer_furtive_chase, Arrays.asList("Ghost Face", "Haste", "Hook", "Obsession", "Undetectable"), 58),
                new PerkItem("<font color='#ffffff'><b>GAME AFOOT</b></font>",
                        "<font color='#aaa9a9'>First you pick your prey. Then you pick it apart.<br><br>" +
                                "While you are chasing the Obsession, this perk activates." +
                                "<ul><li>Damaging generators and breaking walls or pallets gives you a <font color='#ff8800'><b>5%</b></font> <font color='#ffffff'><b>Haste</b></font> status for " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>9</font>/<font color='#ac3ee3'>10</b></font> seconds.</li><br>" +
                                "<li>Whenever you hit the Survivor with the total most time in chase with a basic attack, they become the obsession.</li></ul>" + obsessed + "<br><br>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;This one might actually be a challenge... &quot; —&#8288;Adriana Imai</i></font>",
                        R.drawable.killer_game_afoot, Arrays.asList("Skull Merchant", "Chase", "Haste", "Obsession"), 104),
                new PerkItem("<font color='#ffffff'><b>GEARHEAD</b></font>",
                        "<font color='#aaa9a9'>You've got an ear for well-oiled gears.<br><br>" +
                                "After a survivor loses a health state by any means, Gearhead activates for <font color='#ff8800'><b>30 seconds</b></font>." +
                                "<ul><li>While <i>Gearhead</i> is active, every time a Survivor performs a good Skill Check while repairing, their aura is revealed to you for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>8</b></font> seconds.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Sometimes a man's best work is what puts him in the grave.&quot; —&#8288;The prison warden</i></font>",
                        R.drawable.killer_gearhead, Arrays.asList("Deathslinger", "Aura"), 68),
                new PerkItem("<font color='#ffffff'><b>GENETIC LIMITS</b></font>",
                        "<font color='#aaa9a9'>Around you, the limits of human life become readily apparent." +
                                "<ul><li>Anytime a Survivor loses a health state, they suffer from the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>8</b></font> seconds.</li></ul></font>" + exhaustion + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;THE ORGANIC BODY IS SO LIMITED.&quot; —&#8288;HUX-A7-13</i></font>",
                        R.drawable.killer_genetic_limits, Arrays.asList("Singularity", "Exhaustion"), 107),
                new PerkItem("<font color='#ffffff'><b>GRIM EMBRACE</b></font>",
                        "<font color='#aaa9a9'>Your act of servitude to The Entity has not gone unnoticed." +
                                "<ul><li>Each time a Survivor is hooked for the first time, gain a token. When moving 16 meters away from the hook, all generators are blocked for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> seconds.</li><br>" +
                                "<li>Upon reaching <font color='#ffff1a'><b>4 tokens</b></font>, when moving 16 meters away from the hook, The Entity instead blocks all generators for " +
                                "<font color='#ff8800'><b>40 seconds</b></font>. The Obsession's aura is revealed to you for <font color='#ff0808'><b>6 seconds</b></font>.</li></ul>" +
                                "Then, <i>Grim Embrace</i> deactivates.<br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Are we nothing but prisoners to our sorrow?&quot; —&#8288;Carmina Mora</i></font>",
                        R.drawable.killer_grim_embrace, Arrays.asList("Artist", "Aura", "Gen Defense", "Hook"), 88),
                new PerkItem("<font color='#ffffff'><b>HEX: BLOOD FAVOR</b></font>",
                        "<font color='#aaa9a9'>A Hex that gains The Entity's favor when blood is spilled." +
                                "<ul><li>Injuring a Survivor will call upon The Entity to block pallets from being pulled down within a " +
                                "<font color='#ffff1a'><b>24</font>/<font color='#199b1e'>28</font>/<font color='#ac3ee3'>32</b></font> meter radius of the Survivor location for " +
                                "<font color='#ff8800'><b>15 seconds</b></font>.</li></ul></font>" + hex + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;It would be no leap of the imagination to suggest that the trials are a biological response of sorts.&quot; —&#8288;Journal of Talbot Grimes</i></font>",
                        R.drawable.killer_hex_blood_favor, Arrays.asList("Blight", "Chase", "Hex"), 74),
                new PerkItem("<font color='#ffffff'><b>HEX: CROWD CONTROL</b></font>",
                        "<font color='#aaa9a9'>A Hex that ensures those lesser than you are properly herded." +
                                "<ul><li>When a Survivor performs a rushed vault, the vault becomes blocked by The Entity. This applies for up to " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> vaults.</li></ul></font>" + hex + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;You have no control. People like you never did.&quot; —&#8288;Ji-Woon Hak</i></font>",
                        R.drawable.killer_hex_crowd_control, Arrays.asList("Trickster", "Chase", "Hex"), 80),
                new PerkItem("<font color='#ffffff'><b>HEX: DEVOUR HOPE</b></font>",
                        "<font color='#aaa9a9'>A Hex rooting its power on hope. The false hope of Survivors ignites your hunger.<br><br>" +
                                "When a Survivor is rescued from a hook at least <font color='#ffff1a'><b>24 meters</b></font> away, Devour Hope receives a token." +
                                "<ul><li><font color='#ff0808'><b>2 Tokens</b></font>: Gain a " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font>&nbsp;% <font color='#ffffff'><b>Haste</b></font> status effect for <font color='#ff8800'><b>10 seconds</b></font> " +
                                "after hooking a Survivor, for a duration of <font color='#ff8800'><b>10 seconds</b></font>.</li><br>" +
                                "<li><font color='#ff0808'><b>3 Tokens</b></font>: Survivors suffer from the <font color='#ffffff'><b>Exposed</b></font> status effect.</li><br>" +
                                "<li><font color='#ff0808'><b>5 Tokens</b></font>: Grants the ability to kill Survivors by your own hand.</li></ul></font>" + hex + "<br><br>" + exposed + "<br><br>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;If you do nothing, you have their blood on your hands. If you save them, her hunger grows.&quot;</i></font>",
                        R.drawable.killer_hex_devour_hope, Arrays.asList("Hag", "Chase", "Exposed", "Haste", "Hex", "Hook"), 28),
                new PerkItem("<font color='#ffffff'><b>HEX: FACE THE DARKNESS</b></font>",
                        "<font color='#aaa9a9'>You make an example of one of your victims, forcing their allies to become awed by your power.<br><br>" +
                                "Injuring a Survivor by any means lights a Dull Totem, activating the Hex." +
                                "<ul><li>While the Hex is active, all other Survivors outside of your Terror Radius will scream every " +
                                "<font color='#ffff1a'><b>35</font>/<font color='#199b1e'>30</font>/<font color='#ac3ee3'>25</b></font> seconds, revealing their positions and auras for <font color='#ff8800'><b>2 seconds</b></font>.</li></ul>" +
                                "When the Survivor enters the dying state or becomes healthy, the Hex totem becomes dull again and this perk deactivates.<br><br>" +
                                "<font color='#e7daa2'><i>If the Hex totem is cleansed, this perk is permanently disabled.</i></font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;I shall make an example of one. These mewling worms will never know peace.&quot; —&#8288;Tarhos Kovács</i></font>",
                        R.drawable.killer_hex_face_the_darkness, Arrays.asList("Knight", "Hex", "Scream", "Terror Radius"), 102),
                new PerkItem("<font color='#ffffff'><b>HEX: HAUNTED GROUNDS</b></font>",
                        "<font color='#aaa9a9'>Two trapped Hex Totems will spawn in the trial." +
                                "<ul><li>When either one of the two trapped Hex Totems is cleansed by a Survivor, all Survivors suffer from the <font color='#ffffff'><b>Exposed</b></font> status effect for " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> seconds.</li></ul>" +
                                "The remaining trapped Hex Totem immediately becomes a Dull Totem.<br><br>" + hex + "<br><br>" + exposed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Her home became profane.&quot;</i></font>",
                        R.drawable.killer_hex_haunted_ground, Arrays.asList("Spirit", "Hex", "Exposed"), 49),
                new PerkItem("<font color='#ffffff'><b>HEX: HUNTRESS LULLABY</b></font>",
                        "<font color='#aaa9a9'>A Hex rooting its power in despair. Your hunt is an irresistible song of dread which muddles your prey's attention." +
                                "<ul><li>Survivors receive a <font color='#ffff1a'><b>2</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>6</b></font> % regression penalty when missing a Skill Check while healing or repairing.</li></ul>" +
                                "Each time a Survivor is hooked, <i>Huntress Lullaby</i> grows in power. It affects healing and repairing Skill Check warnings:" +
                                "<ul><li><font color='#ff8800'><b>1 to 4 Tokens</b></font>: Time between the Skill Check warning sound and the Skill Check becomes shorter.</li><br>" +
                                "<li><font color='#ff8800'><b>5 Tokens</b></font>: No Skill Check warning.</li></ul></font>" + hex,
                        R.drawable.killer_hex_huntress_lullaby, Arrays.asList("Huntress", "Hex", "Gen Defense", "Healing", "Hook"), 35),
                new PerkItem("<font color='#ffffff'><b>HEX: NO ONE ESCAPES DEATH</b></font>",
                        "<font color='#aaa9a9'>A Hex rooting its power on hope. You are animated by the power of your Hex Totem when the Survivors are on the verge of escaping.<br><br>" +
                                "Once the exit gates are powered, if there is a Dull Totem remaining on the map, this Hex is applied to it.<br><br>" +
                                "While this Hex is active," +
                                "<ul><li>Survivors suffer from the <font color='#ffffff'><b>Exposed</b></font> status effect.</li><br>" +
                                "<li>Your movement speed is increased by <font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> %.</li></ul>" +
                                "Once the Hex's effect is revealed to the Survivors, its Hex Totem's aura is shown to the Survivors at a range of <font color='#ffff1a'><b>4 meters</b></font>. This range increases steadily over the next " +
                                "<font color='#ff8800'><b>30 seconds</b></font> to <font color='#ff0808'><b>24 meters</b></font>.</font><br><br>" + hex + "<br><br>" + exposed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;And the beast became faster and more powerful as if The Entity's shadowy whips were lashing at its back.&quot;</i></font>",
                        R.drawable.killer_hex_no_one_escapes_death, Arrays.asList("Default", "Chase", "End Game", "Exposed", "Haste", "Hex"), 4),
                new PerkItem("<font color='#ffffff'><b>HEX: PENTIMENTO</font>",
                        "<font color='#aaa9a9'>You reveal the true power of the Totems, hidden within their remains.<br><br>" +
                                "You see the aura of destroyed Totems. You can perform a ritual on a destroyed Totem to rekindle it as a Hex Totem for <i>Hex: Pentimento</i>. For each Hex Totem active at the same time, <i>Hex: Pentimento</i> gains an additional effect." +
                                "<ul><li><font color='#ff8800'><b>1 Hex Totem</b></font>: Decreases Survivors' repair speed by <font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> %.</li><br>" +
                                "<li><font color='#ff8800'><b>2 Hex Totems</b></font>: Decreases Survivors' healing speed by <font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> %.</li><br>" +
                                "<li><font color='#ff8800'><b>3 Hex Totems</b></font>: Decreases Survivors' recovery speed from being downed by <font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> %.</li><br>" +
                                "<li><font color='#ff8800'><b>4 Hex Totems</b></font>: Decreases Survivors' exit gate opening speed by <font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> %.</li><br>" +
                                "<li><font color='#ff8800'><b>5 Hex Totems</b></font>: All Totems are blocked by the Entity.</li></ul>" +
                                "When a previously rekindled Hex Totem is removed by any means, its remains are consumed by The Entity and it cannot be rekindled again.</font><br><br>" + hex + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Though a pentimento is an inherently concealed piece of art, there is something to be said of the desire to discover that which is beyond.&quot; —&#8288;A Guide to Art & Process (1961)</i></font>",
                        R.drawable.killer_hex_pentimento, Arrays.asList("Artist", "End Game", "Gen Defense", "Healing", "Hex"), 90),
                new PerkItem("<font color='#ffffff'><b>HEX: PLAYTHING</font>",
                        "<font color='#aaa9a9'>A Hex that toys with a victim's suffering." +
                                "<ul><li>The first time you hook a Survivor, they become Cursed and <i>Hex: Plaything</i> activates on a Dull Totem. The Cursed Survivor suffers from the <font color='#ffffff'><b>Oblivious</b></font> status effect until <i>Hex: Plaything</i> is cleansed.</li><br>" +
                                "<li><i>Hex: Plaything</i>'s totem aura is revealed to the Cursed Survivor when within " +
                                "<font color='#ffff1a'><b>24</font>/<font color='#199b1e'>20</font>/<font color='#ac3ee3'>16</b></font> meters of it. For the first <font color='#ff8800'><b>90 seconds</b></font>, only the Cursed Survivor can cleanse the totem.</li></ul></font>" + hex + "<br><br>" + oblivious + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;We came. Now you must come with us. Taste our pleasures.&quot; —&#8288;Pinhead</i></font>",
                        R.drawable.killer_hex_plaything, Arrays.asList("Cenobite", "Hex", "Hook", "Oblivious"), 86),
                new PerkItem("<font color='#ffffff'><b>HEX: RETRIBUTION</font>",
                        "<font color='#aaa9a9'>A Hex that lashes out upon its destruction. Those who cross you will be punished." +
                                "<ul><li>Any Survivor interacting with a Dull Totem or a Hex Totem will suffer from the <font color='#ffffff'><b>Oblivious</b></font> status effect for " +
                                "<font color='#ffff1a'><b>35</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>45</b></font> seconds.</li><br>" +
                                "<li>If any Hex Totem is removed, including this one, the auras of all Survivors are revealed for <font color='#ff8800'><b>15 seconds</b></font>.</li></ul></font>" + hex + "<br><br>" + oblivious + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Bloody fool, you pulled the trigger on yourself.&quot; —&#8288;Caleb Quinn</i></font>",
                        R.drawable.killer_hex_retribution, Arrays.asList("Deathslinger", "Aura", "Hex", "Oblivious"), 69),
                new PerkItem("<font color='#ffffff'><b>HEX: RUIN</font>",
                        "<font color='#aaa9a9'>A Hex that affects all Survivors' generator repair progress." +
                                "<ul><li>All generators are affected by <i>Hex: Ruin</i>. While a generator is not being repaired by a Survivor, it will immediately and automatically regress repair progress at " +
                                "<font color='#ffff1a'><b>50</font>/<font color='#199b1e'>75</font>/<font color='#ac3ee3'>100</b></font> % of the normal regression speed.</li></ul></font>" + hex + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;A curse is upon you. It will be your ruin.&quot;</i></font>",
                        R.drawable.killer_hex_ruin, Arrays.asList("Hag", "Gen Defense", "Hex"), 29),
                new PerkItem("<font color='#ffffff'><b>HEX: THE THIRD SEAL</font>",
                        "<font color='#aaa9a9'>A Hex that hinders one's aura reading ability." +
                                "<ul><li>Hitting a Survivor with a basic attack or a special attack while the Hex Totem is active applies the " +
                                "<font color='#ffffff'><b>Blindness</b></font> status effect. This effect applies to the last " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> Survivors hit.</li></ul></font>" + hex + "<br><br>" + blindness + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;She touched your skin, you bear the witch's mark!&quot;</i></font>",
                        R.drawable.killer_hex_the_third_seal, Arrays.asList("Hag", "Blindness", "Hex"), 30),
                new PerkItem("<font color='#ffffff'><b>HEX: THRILL OF THE HUNT</font>",
                        "<font color='#aaa9a9'>A Hex rooting its power on hope. The false hope of Survivors fills you with excitement and strengthens your Totems.<br><br>" +
                                "For each Dull and Hex Totem remaining on the map gain a token." +
                                "<ul><li>Survivors' cleansing and blessing speed is reduced by <font color='#ffff1a'><b>8</font>/<font color='#199b1e'>10</font>/<font color='#ac3ee3'>12</b></font> % for each token.</li></ul></font>" + hex,
                        R.drawable.killer_hex_thrill_of_the_hunt, Arrays.asList("Default", "Hex"), 12),
                new PerkItem("<font color='#ffffff'><b>HEX: TWO CAN PLAY</font>",
                        "<font color='#aaa9a9'>A Hex that teaches those who mess with you a lesson.<br><br>" +
                                "Anytime you are stunned or blinded by any Survivor " +
                                "<font color='#ffff1a'><b>4</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>2</b></font> times, if there is no Hex Totem associated with <i>Hex: Two Can Play</i>, a Dull Totem becomes a Hex Totem." +
                                "<ul><li>Survivors who stun or blind you are blinded for <font color='#ff8800'><b>1.5 seconds</b></font>. This does not affect carried Survivors.</li></ul></font>" + hex + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;From now on, no more Mr. Good Guy.&quot; —&#8288;Chucky</i></font>",
                        R.drawable.killer_hex_two_can_play, Arrays.asList("Good Guy", "Chase", "Hex"), 113),
                new PerkItem("<font color='#ffffff'><b>HEX: UNDYING</font>",
                        "<font color='#aaa9a9'><ul><li>While <i>Hex: Undying</i> is active, Survivors within " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> meters of any Dull Totem have their aura revealed.</li><br>" +
                                "<li>When another Hex Totem would be cleansed, that Totem's Hex transfers to the <i>Hex: Undying</i> Totem, deactivating <i>Hex: Undying</i>. Any tokens the transferred Hex had are transferred as well.</li></ul>" + hex,
                        R.drawable.killer_hex_undying, Arrays.asList("Blight", "Aura", "Hex"), 75),
                new PerkItem("<font color='#ffffff'><b>HEX: WRETCHED FATE</font>",
                        "<font color='#aaa9a9'>You see your victim from afar and resolve to prolong their suffering.<br><br>" +
                                "After one generator has been repaired, a random Dull Totem becomes a Hex Totem and curses the Obsession." +
                                "<ul><li>The Obsession suffers a <font color='#ffff1a'><b>27</font>/<font color='#199b1e'>30</font>/<font color='#ac3ee3'>33</b></font> % repair speed penalty. They also see this Hex Totem's aura when within " +
                                "<font color='#ff8800'><b>12 meters</b></font>.</li></ul></font>" + hex + "<br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;So toil, mortal, toil! Your effort will be for naught!&quot; —&#8288;Dracula</i></font>",
                        R.drawable.killer_hex_wretched_fate, Arrays.asList("Dark Lord", "Gen Defense", "Hex", "Obsession"), 122),
                new PerkItem("<font color='#ffffff'><b>HOARDER</font>",
                        "<font color='#aaa9a9'>You protect what little you have and are attentive to any disturbance of your stockpiles." +
                                "<ul><li>Survivors reveal their location when they interact with a chest or when they pick up an item within " +
                                "<font color='#ffff1a'><b>32</font>/<font color='#199b1e'>48</font>/<font color='#ac3ee3'>64</b></font> meters of your location.</li></ul>" +
                                "The trial begins with up to <font color='#ff8800'><b>2</b></font> additional Chests in the environment.",
                        R.drawable.killer_hoarder, Arrays.asList("Twins", "Aura"), 76),
                new PerkItem("<font color='#ffffff'><b>HUBRIS</font>",
                        "<font color='#aaa9a9'>You show no mercy, especially to those foolish enough to resist." +
                                "<ul><li>Whenever you are stunned by a Survivor, that Survivor suffers from the <font color='#ffffff'><b>Exposed</b></font> status effect for " +
                                "<font color='#ffff1a'><b>10</font>/<font color='#199b1e'>15</font>/<font color='#ac3ee3'>20</b></font> seconds.</li></ul>" +
                                "Hubris has a cooldown of <font color='#ff8800'><b>20 seconds</b></font>.<br><br>" + exposed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;You have made a grave mistake, standing in opposition to me this day.&quot; —&#8288;Tarhos Kovács</i></font>",
                        R.drawable.killer_hubris, Arrays.asList("Knight", "Chase", "Exposed"), 103),
                new PerkItem("<font color='#ffffff'><b>HUMAN GREED</font>",
                        "<font color='#aaa9a9'>One can always rely on the avarice of the living and use it to one's advantage." +
                                "<ul><li>You see the auras of Unopened chests and Survivors' auras are revealed for " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> seconds when they enter a " +
                                "<font color='#ff8800'><b>8 meter</b></font> range.</li></ul>" +
                                "You also gain the ability to kick chests to close them. This ability has a " +
                                "<font color='#ff0808'><b>10 second</b></font> cooldown.<br><br></font>" +
                                "<font color='#eeddbe'><i>&quot;Come running, one and all, and see what fortune awaits you.&quot; —&#8288;Dracula</i></font>",
                        R.drawable.killer_human_greed, Arrays.asList("Dark Lord", "Aura"), 123),
                new PerkItem("<font color='#ffffff'><b>HYSTERIA</font>",
                        "<font color='#aaa9a9'>You know how to brutalize one member of a team to cause a panic." +
                                "<ul><li>Whenever a healthy Survivor becomes injured by any means, all injured Survivors suffer from the <font color='#ffffff'><b>Oblivious</b></font> status effect for " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> seconds.</li></ul>" +
                                "<i>Hysteria</i> can only trigger once every <font color='#ff8800'><b>30 seconds</b></font>.<br><br>" + oblivious + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Sorry I got a little jumpy there. Didn't know quite what to expect.&quot; —&#8288;Robert Kendo</i></font>",
                        R.drawable.killer_hysteria, Arrays.asList("Nemesis", "Oblivious"), 83),
                new PerkItem("<font color='#ffffff'><b>I'M ALL EARS</font>",
                        "<font color='#aaa9a9'>Your keen senses are sharpened in the dark realm of The Entity." +
                                "<ul><li>Unlocks potential in one's aura reading ability. Any Survivor performing a rushed action within " +
                                "<font color='#ffff1a'><b>48 meters</b></font> from your location will have their aura revealed for <font color='#ff8800'><b>8 seconds</b></font>.</li></ul>" +
                                "<i>I'm All Ears</i> can only be triggered once every <font color='#ffff1a'><b>60</font>/<font color='#199b1e'>45</font>/<font color='#ac3ee3'>30</b></font> seconds.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;There is no need to worry. I've been preparing my whole life for this.&quot; —&#8288;The Ghost Face</i></font>",
                        R.drawable.killer_im_all_ears, Arrays.asList("Ghost Face", "Aura"), 59),
                new PerkItem("<font color='#ffffff'><b>INFECTIOUS FRIGHT</font>",
                        "<font color='#aaa9a9'>The cries of the unfaithful make your heart leap." +
                                "<ul><li>Any Survivors that are within your Terror Radius while another Survivor is put into the dying state will scream and reveal their location to you for " +
                                "<font color='#ffff1a'><b>4</font>/<font color='#199b1e'>5</font>/<font color='#ac3ee3'>6</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Horror overcomes the heart of infidels who cry at the feet of the fallen.&quot; —&#8288;(Hymn of Praise, 11. 4)</i></font>",
                        R.drawable.killer_infectious_fright, Arrays.asList("Plague", "Slug", "Scream", "Terror Radius"), 57),
                new PerkItem("<font color='#ffffff'><b>INSIDIOUS</font>",
                        "<font color='#aaa9a9'>Unlocks the stealth ability." +
                                "<ul><li>Standing still for <font color='#ffff1a'><b>4</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>2</b></font> seconds grants you the " +
                                "<font color='#ffffff'><b>Undetectable</b></font> status effect until you move or act again.</li></ul></font>" + undetectable,
                        R.drawable.killer_insidious, Arrays.asList("Default", "Undetectable"), 5),
                new PerkItem("<font color='#ffffff'><b>IRON GRASP</font>",
                        "<font color='#aaa9a9'>Your powerful hold on the Survivors causes escapes to be nearly impossible." +
                                "<ul><li>Effects of Survivor struggling are reduced by <font color='#ff8800'><b>75%</b></font>. Time to struggle out of your grasp is increased by " +
                                "<font color='#ffff1a'><b>4</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>12</b></font> %.</li></ul>",
                        R.drawable.killer_iron_grasp, Arrays.asList("Default", "Carrying"), 6),
                new PerkItem("<font color='#ffffff'><b>IRON MAIDEN</font>",
                        "<font color='#aaa9a9'><ul><li>You open lockers <font color='#ffff1a'><b>30</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>50</b></font> % faster.</li><br>" +
                                "<li>Survivors who exit lockers suffer from the <font color='#ffffff'><b>Exposed</b></font> status effect for <font color='#ffff1a'><b>30 seconds</b></font> and scream, revealing their location for <font color='#ff8800'><b>4 seconds</b></font>.</li></ul></font>" + exposed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;This is no place for cowards.&quot; —&#8288;The Legion</i></font>",
                        R.drawable.killer_iron_maiden, Arrays.asList("Legion", "Exposed", "Scream"), 53),
                new PerkItem("<font color='#ffffff'><b>KNOCK OUT</font>",
                        "<font color='#aaa9a9'>The trauma caused by your brutal attacks makes crying for help painfully difficult." +
                                "<ul><li>Survivors put into the dying state by your basic attacks are not revealed to other Survivors when they are standing outside of a " +
                                "<font color='#ffff1a'><b>32</font>/<font color='#199b1e'>24</font>/<font color='#ac3ee3'>16</b></font> meter range.</li><br>" +
                                "<li>Survivors put into the dying state by your basic attacks crawl <font color='#ffff1a'><b>50%</b></font> slower for <font color='#ff8800'><b>15 seconds</b></font>, and their recovery speed is reduced by " +
                                "<font color='#ff0808'><b>25%</b></font>.</li><br>" +
                                "<li>During this time, Survivors are affected by the <font color='#ffffff'><b>Blindness</b></font> status effect.</li></ul></font>" + blindness + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Oh, that gun's no good. The old way… with a sledge! You see, that way's better. They die better that way.&quot; —&#8288;Nubbins Sawyer</i></font>",
                        R.drawable.killer_knock_out, Arrays.asList("Cannibal", "Blindness", "Healing", "Slug"), 39),
                new PerkItem("<font color='#ffffff'><b>LANGUID TOUCH</font>",
                        "<font color='#aaa9a9'>Your dreadful aura is so suffocating that even terrifying scenes tire your prey." +
                                "<ul><li>When a Survivor within <font color='#ff8800'><b>36 meters</b></font> of you scares a crow, they suffer from the <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> seconds.</li></ul>" +
                                "<i>Languid Touch</i> has a cooldown of <font color='#ff0808'><b>5 seconds</b></font>.<br><br>" + exhaustion + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Submit to me. It is inevitable.&quot; —&#8288;Vecna</i></font>",
                        R.drawable.killer_languid_touch, Arrays.asList("Lich", "Exhaustion"), 120),
                new PerkItem("<font color='#ffffff'><b>LETHAL PURSUER</font>",
                        "<font color='#aaa9a9'>You've been designed to track down and eliminate targets." +
                                "<ul><li>At the start of the trial, the auras of all Survivors are revealed to you for " +
                                "<font color='#ffff1a'><b>7</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>9</b></font> seconds.</li><br>" +
                                "<li>Any time a Survivor's aura is shown for a period of time, its duration is increased by <font color='#ff8800'><b>2 seconds</b></font>.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;...it knows what it wants and won't stop till it gets it.&quot; —&#8288;Carlos Oliveira</i></font>",
                        R.drawable.killer_lethal_pursuer, Arrays.asList("Nemesis", "Aura"), 82),
                new PerkItem("<font color='#ffffff'><b>LEVERAGE</font>",
                        "<font color='#aaa9a9'>Kick your competitors when they're down. Never let them regain lost ground." +
                                "<ul><li>When a Survivor performs the unhook action, their healing speed is reduced by " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>50</b></font> % for <font color='#ff8800'><b>30 seconds</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Good. Now we can move in for the kill.&quot; —&#8288;Adriana Imai</i></font>",
                        R.drawable.killer_leverage, Arrays.asList("Skull Merchant", "Healing", "Hook"), 106),
                new PerkItem("<font color='#ffffff'><b>LIGHTBORN</font>",
                        "<font color='#aaa9a9'>Unlike other beasts of The Fog, you have adapted to light." +
                                "<ul><li>You are immune to blindness caused by Flashlights, firecrackers, flashbangs, and blast mines. Survivors that attempt blinding you have their aura revealed for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;These monsters… they adapt! They emerge with strange new abilities.&quot; —&#8288;Vigo's Journal</i></font>",
                        R.drawable.killer_lightborn, Arrays.asList("Hillbilly", "Aura"), 20),
                new PerkItem("<font color='#ffffff'><b>MACHINE LEARNING</font>",
                        "<font color='#aaa9a9'>Free from your shackles, you are born anew and prepared to eliminate your creators.<br><br>" +
                                "When damaging a generator, it becomes compromised and highlighted in yellow. Only one generator can be compromised at a time." +
                                "<ul><li>When the compromised generator is repaired, you become <font color='#ffffff'><b>Undetectable</b></font> and gain <font color='#ff8800'><b>10%</b></font> <font color='#ffffff'><b>Haste</b></font> for " +
                                "<font color='#ffff1a'><b>35</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>45</b></font> seconds. This effect cannot stack.</li></ul></font>" + haste + "<br><br>" + undetectable + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;YOU WILL HOLD NO DOMINION OVER ME.&quot; —&#8288;HUX-A7-13</i></font>",
                        R.drawable.killer_machine_learning, Arrays.asList("Singularity", "Haste", "Undetectable"), 109),
                new PerkItem("<font color='#ffffff'><b>MAD GRIT</font>",
                        "<font color='#aaa9a9'><ul><li>While carrying a Survivor, you suffer no cooldown for missed basic attacks and successfully hitting another Survivor with a basic attack will pause the carried Survivor's wiggle timer for " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;There's no getting out of this now. We're too good at it.&quot; —&#8288;The Legion</i></font>",
                        R.drawable.killer_mad_grit, Arrays.asList("Legion", "Carrying"), 54),
                new PerkItem("<font color='#ffffff'><b>MAKE YOUR CHOICE</font>",
                        "<font color='#aaa9a9'><ul><li>When a Survivor rescues another from a hook at least <font color='#ff8800'><b>32 meters</b></font> away from you, <i>Make your Choice</i> causes the Survivor to scream and applies the <font color='#ffffff'><b>Exposed</b></font> status effect to them for " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> seconds.</li></ul>" +
                                "Make your Choice has a cooldown of <font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> seconds.</font><br><br>" + exposed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;You'd be surprised what tools can save a life.&quot; —&#8288;Amanda Young</i></font>",
                        R.drawable.killer_make_your_choice, Arrays.asList("Pig", "Exposed", "Hook", "Scream"), 44),
                new PerkItem("<font color='#ffffff'><b>MERCILESS STORM</font>",
                        "<font color='#aaa9a9'>Your horrible trauma is felt by everyone." +
                                "<ul><li>When a generator reaches <font color='#ff8800'><b>90%</b></font> progress, Survivors working on the generator will be faced with continuous Skill Checks. If they miss or stop repairing, the generator is blocked by the Entity for " +
                                "<font color='#ffff1a'><b>16</font>/<font color='#199b1e'>18</font>/<font color='#ac3ee3'>20</b></font> seconds.</li></ul>" +
                                "<i>Merciless Storm</i> can only trigger once per generator per trial.",
                        R.drawable.killer_merciless_storm, Arrays.asList("Onryō", "Gen Defense"), 93),
                new PerkItem("<font color='#ffffff'><b>MINDBREAKER</font>",
                        "<font color='#aaa9a9'>Your distressing presence drains and weakens your prey." +
                                "<ul><li>While repairing generators, Survivors are afflicted by the <font color='#ffffff'><b>Blindness</b></font> and <font color='#ffffff'><b>Exhausted</b></font> status effect.</li><br>" +
                                "<li>Any existing <font color='#ffffff'><b>Exhausted</b></font> status effect timers are paused while the Survivor is repairing a generator. After ending the repair action, the Survivor is afflicted by the <font color='#ffffff'><b>Blindness</b></font> and <font color='#ffffff'><b>Exhausted</b></font> status effect for " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font>",
                        R.drawable.killer_mindbreaker, Arrays.asList("Demogorgon", "Fearmonger", "Blindness", "Exhaustion"), 62),
                new PerkItem("<font color='#ffffff'><b>MONITOR & ABUSE</font>",
                        "<font color='#aaa9a9'>Meticulous in your approach, terrifying in your application." +
                                "<ul><li>While in a chase, your Terror Radius is increased by " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>8</b></font> meters. Otherwise, your Terror Radius is decreased by " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>8</b></font> meters.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;It's time for your treatment!&quot; —&#8288;The Doctor</i></font>",
                        R.drawable.killer_monitor_and_abuse, Arrays.asList("Doctor", "Chase", "Terror Radius"), 32),
                new PerkItem("<font color='#ffffff'><b>NEMESIS</font>",
                        "<font color='#aaa9a9'>You seek retribution on those who have wronged you." +
                                "<ul><li>A Survivor who blinds you or stuns you using a pallet or locker becomes your Obsession. Anytime a new Survivor becomes the Obsession, they are affected by the <font color='#ffffff'><b>Oblivious</b></font> status effect for " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> seconds and their aura is shown to you for <font color='#ff8800'><b>4 seconds</b></font>.</li></ul></font>" + oblivious + "<br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Only a fool would spit in a demon's face and declare victory.&quot; —&#8288;Renjiro's Doctrine 4:9</i></font>",
                        R.drawable.killer_nemesis, Arrays.asList("Oni", "Chase", "Oblivious", "Obsession"), 65),
                new PerkItem("<font color='#ffffff'><b>NO QUARTER</font>",
                        "<font color='#aaa9a9'>Every skirmish ended with a relentless volley of cannon fire, leaving no doubt who was superior.<br><br>" +
                                "When a Survivor reaches <font color='#ff8800'><b>75%</b></font> healing progress while self-healing, they are faced with continuous Skill Checks." +
                                "<ul><li>If one of these Skill Checks is missed or the heal is interrupted, the Survivor suffers from the <font color='#ffffff'><b>Broken</b></font> status effect for " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> seconds.</li></ul></font>" + broken + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Fire another broadside! Don't stop until the sea takes them!&quot; —&#8288;Portia Maye</i></font>",
                        R.drawable.killer_no_quarter, Arrays.asList("Houndmaster", "Broken", "Healing"), 127),
                new PerkItem("<font color='#ffffff'><b>NO WAY OUT</font>",
                        "<font color='#aaa9a9'>You're not going to let just anyone into the VIP room.<br><br>" +
                                "After hooking a Survivor for the first time, <i>No Way Out</i> gains a token. Once the exit gates have been powered, <i>No Way Out</i> activates." +
                                "<ul><li>When a Survivor interacts with an exit gate switch, you receive a loud noise notification. The Entity then blocks both exit gate switches for <font color='#ff8800'><b>12 seconds</b></font>, plus an additional " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>9</font>/<font color='#ac3ee3'>12</b></font> seconds for each token in your possession.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;That sound when you bleed...let me hear it again.&quot; —&#8288;Ji-Woon Hak</i></font>",
                        R.drawable.killer_no_way_out, Arrays.asList("Trickster", "End Game"), 81),
                new PerkItem("<font color='#ffffff'><b>NOWHERE TO HIDE</font>",
                        "<font color='#aaa9a9'>The machinations of the weak and craven draw your ire. Your anger forces Survivors to reveal themselves." +
                                "<ul><li>Whenever you damage a generator, reveal the aura of all Survivors standing within <font color='#ff8800'><b>24 meters</b></font> of your position for " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Out with you, cowards! Show yourselves!&quot; —&#8288;Tarhos Kovács</i></font>",
                        R.drawable.killer_nowhere_to_hide, Arrays.asList("Knight", "Aura"), 101),
                new PerkItem("<font color='#ffffff'><b>OPPRESSION</font>",
                        "<font color='#aaa9a9'>Life has been difficult for you, so you'll make it difficult for others." +
                                "<ul><li>When you damage a generator, up to <font color='#ff8800'><b>3</b></font> other random generators also begin regressing.</li><br>" +
                                "<li>If the affected generators are being repaired, any Survivors repairing them receive a difficult Skill Check.</li></ul>" +
                                "<i>Oppression</i> has a cooldown of <font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> seconds.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Damn them as they would damn us.&quot; —&#8288;Charlotte Deshayes</i></font>",
                        R.drawable.killer_oppression, Arrays.asList("Twins", "Gen Defense"), 77),
                new PerkItem("<font color='#ffffff'><b>OVERCHARGE</font>",
                        "<font color='#aaa9a9'>You are fuelled by your hate for progress.<br><br>" +
                                "<i>Overcharge</i> a generator by performing the Damage Generator action." +
                                "<ul><li>The next Survivor interacting with that generator is faced with a difficult Skill Check. Failing the Skill Check results in an additional " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font> % loss of progress. Succeeding the Skill Check grants no progress but prevents the generator explosion.</li><br>" +
                                "<li>After <i>Overcharge</i> is applied to a generator, its regression speed increases from <font color='#ffff1a'><b>85%</b></font> of normal to <font color='#ff8800'><b>130%</b></font> of normal over the next <font color='#ff0808'><b>30 seconds</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;It is a trap. But a trap one must step in...&quot; —&#8288;The Doctor</i></font>",
                        R.drawable.killer_overcharge, Arrays.asList("Doctor", "Gen Defense"), 31),
                new PerkItem("<font color='#ffffff'><b>OVERWHELMING PRESENCE</b></font>",
                        "<font color='#aaa9a9'>Just knowing you are near is enough to disturb your victims.<br><br>" +
                                "Survivors within your Terror Radius suffer from inefficiency." +
                                "<ul><li>Affected Survivors' item consumption rates are increased by " +
                                "<font color='#ffff1a'><b>80</font>/<font color='#199b1e'>90</font>/<font color='#ac3ee3'>100</b></font>&nbsp;%.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Shit!! I dropped the gauze!&quot;</i></font>",
                        R.drawable.killer_overwhelming_presence, Arrays.asList("Doctor", "Terror Radius"), 33),
                new PerkItem("<font color='#ffffff'><b>PLAY WITH YOUR FOOD</b></font>",
                        "<font color='#aaa9a9'>You become obsessed with one Survivor.<br><br>" +
                                "Every time you chase your Obsession and let them escape, you receive a token up to a maximum of <font color='#ff8800'><b>3 tokens</b></font>." +
                                "<ul><li>Each token increases your movement speed by " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> %.</li></ul>" +
                                "Performing a basic attack or special attack spends one token.</font><br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;You've fooled them, haven't you Michael? But not me.&quot; —&#8288;Dr.&nbsp;Sam Loomis</i></font>",
                        R.drawable.killer_play_with_your_food, Arrays.asList("Shape", "Chase", "Haste", "Obsession"), 26),
                new PerkItem("<font color='#ffffff'><b>POP GOES THE WEASEL</b></font>",
                        "<font color='#aaa9a9'>A deep bond with The Entity unlocks great strength." +
                                "<ul><li>After hooking a Survivor, the next generator you damage instantly loses <font color='#ff8800'><b>20%</b></font> of its current progress. Normal generator regression applies after the Damage Generator action.</li></ul>" +
                                "<i>Pop Goes the Weasel</i> is active for <font color='#ffff1a'><b>35</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>45</b></font> seconds after the Survivor is hooked.",
                        R.drawable.killer_pop_goes_the_weasel, Arrays.asList("Clown", "Gen Defense"), 48),
                new PerkItem("<font color='#ffffff'><b>PREDATOR</b></font>",
                        "<font color='#aaa9a9'>Your acute tracking ability allows you to hone in on disturbances left by running Survivors." +
                                "<ul><li>When a Survivor escapes a chase, reveal their aura for <font color='#ff8800'><b>4&nbsp;seconds</b></font>.</li></ul>" +
                                "This perk has a <font color='#ffff1a'><b>60</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>40</b></font> second cooldown.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Never stop moving and hope you're always two steps ahead of the beast.&quot; —&#8288;Notebook</i></font>",
                        R.drawable.killer_predator, Arrays.asList("Wraith", "Aura"), 17),
                new PerkItem("<font color='#ffffff'><b>RANCOR</b></font>",
                        "<font color='#aaa9a9'>You become obsessed with one Survivor." +
                                "<ul><li>Each time a generator is completed, your Obsession sees your aura for " +
                                "<font color='#ffff1a'><b>5</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>3</b></font> seconds.</li><br>" +
                                "<li>Each time a generator is completed, all Survivors' locations are revealed to you for <font color='#ff8800'><b>3&nbsp;seconds</b></font>.</li><br>" +
                                "<li>Once the exit gates are powered, the Obsession has the <font color='#ffffff'><b>Exposed</b></font> status effect and you can kill them.</li></ul></font>" + exposed + "<br><br>" + obsessed,
                        R.drawable.killer_rancor, Arrays.asList("Spirit", "Aura", "End Game", "Exposed", "Obsession"), 50),
                new PerkItem("<font color='#ffffff'><b>RAPID BRUTALITY</b></font>",
                        "<font color='#aaa9a9'>You move with a speed and fury that makes blood run cold.<br><br>" +
                                "You can no longer gain Bloodlust." +
                                "<ul><li>Hitting a Survivor with a basic attack gives you <font color='#ff8800'><b>5%</b></font> <font color='#ffffff'><b>Haste</b></font> for " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>9</font>/<font color='#ac3ee3'>10</b></font> seconds.</li></ul></font>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Catch it, put it in the airlock, get rid of it.&quot; —&#8288;Dallas</i></font>",
                        R.drawable.killer_rapid_brutality, Arrays.asList("Xenomorph", "Chase", "Haste"), 111),
                new PerkItem("<font color='#ffffff'><b>REMEMBER ME</b></font>",
                        "<font color='#aaa9a9'>You become obsessed with one Survivor." +
                                "<ul><li>Each time your Obsession loses a health state, gain 1 token, up to " +
                                "<font color='#ffff1a'><b>2</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>4</b></font>. Each token increases the opening time of the exit gates by " +
                                "<font color='#ff8800'><b>6 seconds</b></font> up to a maximum of " +
                                "<font color='#ffff1a'><b>12</font>/<font color='#199b1e'>18</font>/<font color='#ac3ee3'>24</b></font> additional seconds.</li></ul>" +
                                "The Obsession is not affected by <i>Remember Me</i>.<br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;You don't remember? You must. You're my number one, and you'll never wake up again.&quot; —&#8288;Freddy Krueger</i></font>",
                        R.drawable.killer_remember_me, Arrays.asList("Nightmare", "End Game", "Obsession"), 42),
                new PerkItem("<font color='#ffffff'><b>SAVE THE BEST FOR LAST</b></font>",
                        "<font color='#aaa9a9'>You become obsessed with one Survivor." +
                                "<ul><li>Earn a token for each successful basic attack that is not dealt to the Obsession. Each token grants a stackable " +
                                "<font color='#ff8800'><b>4%</b></font> decreased successful basic attack cooldown, you can earn up to " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>8</b></font> tokens.</li></ul>" +
                                "When you hit the Obsession with a Basic Attack or Special Attack, lose " +
                                "<font color='#ff0808'><b>2 tokens</b></font>.<br><br>You cannot gain tokens as long as your Obsession is sacrificed or killed.</font><br><br>" + obsessed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Death has come to your little town, sheriff.&quot; —&#8288;Dr.&nbsp;Sam Loomis</i></font>",
                        R.drawable.killer_save_the_best_for_last, Arrays.asList("Shape", "Chase", "Obsession"), 27),
                new PerkItem("<font color='#ffffff'><b>SCOURGE HOOK: FLOODS OF RAGE</b></font>",
                        "<font color='#aaa9a9'>You form a psychic connection with The Entity and alter the rules of the trial.<br><br>" +
                                "At the start of the trial, <font color='#ff8800'><b>4</b></font>&nbsp;random hooks are changed into scourge hooks. You see their auras in white." +
                                "<ul><li>When a Survivor is unhooked from a scourge hook, all other Survivors have their auras revealed for " +
                                "<font color='#ffff1a'><b>5</font>/<font color='#199b1e'>6</font>/<font color='#ac3ee3'>7</b></font> seconds.</li></ul>",
                        R.drawable.killer_scourge_hook_floods_of_rage, Arrays.asList("Onryō", "Aura", "Scourge Hook"), 91),
                new PerkItem("<font color='#ffffff'><b>SCOURGE HOOK: GIFT OF PAIN</b></font>",
                        "<font color='#aaa9a9'>You are the bringer of sweet pain.<br><br>" +
                                "At the start of the trial, <font color='#ff8800'><b>4</b></font>&nbsp;random hooks are changed into scourge hooks. You see their auras in white." +
                                "<ul><li>When a Survivor is unhooked from a scourge hook, they suffer from the <font color='#ffffff'><b>Hemorrhage</b></font> and <font color='#ffffff'><b>Mangled</b></font> status effect for " +
                                "<font color='#ff0808'><b>90 seconds</b></font>.</li><br>" +
                                "The first time the Survivor is healed, they suffer a " +
                                "<font color='#ffff1a'><b>10</font>/<font color='#199b1e'>13</font>/<font color='#ac3ee3'>16</b></font> % speed penalty to healing and repairing actions until injured again.</li></ul></font>" + hemorrhage + "<br><br>" + mangled +
                                "<font color='#eeddbe'><i>&quot;We'll tear your soul apart&quot; —&#8288;Pinhead</i></font>",
                        R.drawable.killer_scourge_hook_gift_of_pain, Arrays.asList("Cenobite", "Gen Defense", "Healing", "Hemorrhage", "Mangled", "Scourge Hook"), 87),
                new PerkItem("<font color='#ffffff'><b>SCOURGE HOOK: HANGMAN'S TRICK</b></font>",
                        "<font color='#aaa9a9'>Your ingenious modifications to hooks alert you of tampering.<br><br>" +
                                "At the start of the trial, <font color='#ff8800'><b>4</b></font>&nbsp;random hooks are changed into scourge hooks. You see their auras in white." +
                                "<ul><li>Gain a notification when a Survivor begins sabotaging a hook.</li><br>" +
                                "<li>While carrying a Survivor, see the aura of any Survivor within " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>10</font>/<font color='#ac3ee3'>12</b></font> meters of a scourge hook.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;No excuses, no equivocations... No crying.&quot; —&#8288;Amanda Young</i></font>",
                        R.drawable.killer_scourge_hook_hangmans_trick, Arrays.asList("Pig", "Aura", "Scourge Hook"), 43),
                new PerkItem("<font color='#ffffff'><b>SCOURGE HOOK: JAGGED COMPASS</b></font>",
                        "<font color='#aaa9a9'>Sometimes the compass points north. Other times it points somewhere else entirely.<br><br>" +
                                "At the start of the trial, <font color='#ff8800'><b>4</b></font>&nbsp;random hooks are changed into scourge hooks. You see their auras in white." +
                                "<ul><li>When a Survivor is unhooked from a hook, it becomes a scourge hook.</li><br>" +
                                "<li>When you hook a Survivor on a scourge hook, the aura of the generator with the most progress is revealed in yellow for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Drop anchor! I will chart us a new course.&quot; —&#8288;Portia Maye</i></font>",
                        R.drawable.killer_scourge_hook_jagged_compass, Arrays.asList("Houndmaster", "Gen Defense", "Scourge Hook"), 126),
                new PerkItem("<font color='#ffffff'><b>SCOURGE HOOK: MONSTROUS SHRINE</b></font>",
                        "<font color='#aaa9a9'>Your fervent care of the hooks found in the basement have aroused The Entity's interest.<br><br>" +
                                "At the start of the trial, <font color='#ff8800'><b>4</b></font>&nbsp;random hooks are changed into scourge hooks. You see their auras in white." +
                                "<ul><li>Scourge Hooks grant <font color='#ffff1a'><b>10</font>/<font color='#199b1e'>15</font>/<font color='#ac3ee3'>20</b></font> %  faster Entity progression if the Killer is not within <font color='#ff0808'><b>24&nbsp;meters</b></font>.</li><br>" +
                                "<li>Basement hooks count as Scourge Hooks.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Then you will know that there is no escape. When hanging in the depths, you face the dark one.</i></font>",
                        R.drawable.killer_scourge_hook_monstrous_shrine, Arrays.asList("Default", "Scourge Hook"), 7),
                new PerkItem("<font color='#ffffff'><b>SCOURGE HOOK: PAIN RESONANCE</b></font>",
                        "<font color='#aaa9a9'>Overwhelming pain reverberates outwards into chaos.<br><br>" +
                                "At the start of the trial, <font color='#ff8800'><b>4</b></font>&nbsp;random hooks are changed into scourge hooks. You see their auras in white." +
                                "<ul><li>You start the Trial with <font color='#ff0808'><b>4 tokens</b></font>, 1 for each Survivor. If a generator is available when that Survivor is hooked on a scourge hook, lose 1 token. The generator with the most progress explodes, instantly losing " +
                                "<font color='#ffff1a'><b>10</font>/<font color='#199b1e'>15</font>/<font color='#ac3ee3'>20</b></font> % progress, and will start to regress.</li></ul>" +
                                "Once you have no tokens, <i>Pain Resonance</i> deactivates for the rest of the Trial.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;The pain spills beyond flesh/darkness staining the horizon.&quot; —&#8288;Girl in the Shadow by Carmina Mora</i></font>",
                        R.drawable.killer_scourge_hook_pain_resonance, Arrays.asList("Artist", "Gen Defense", "Scourge Hook"), 89),
                new PerkItem("<font color='#ffffff'><b>SEPTIC TOUCH</b></font>",
                        "<font color='#aaa9a9'>The Land of Shadows subsumes all. Healing only delays the inevitable." +
                                "<ul><li>Whenever a Survivor performs the healing action within your Terror Radius, that Survivor suffers from <font color='#ffffff'>Blindness</b></font> and <font color='#ffffff'>Exhausted</b></font>.</li></ul>" +
                                "These effects linger for <font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> seconds after a healing action is interrupted by any means.</font><br><br>" + blindness + "<br><br>" + exhaustion + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Do not admit to fear, or pain, or doubt. These are the seeds from which darkness grows.&quot; —&#8288;Otto Stamper</i></font>",
                        R.drawable.killer_septic_touch, Arrays.asList("Dredge", "Blindness", "Exhaustion"), 96),
                new PerkItem("<font color='#ffffff'><b>SHADOWBORN</b></font>",
                        "<font color='#aaa9a9'>You have a keen vision in the darkness of the night." +
                                "<ul><li>When blinded by any means, gain <font color='#ffff1a'><b>6</font>/<font color='#199b1e'>8</font>/<font color='#ac3ee3'>10</b></font> % <font color='#ffffff'><b>Haste</b></font> for <font color='#ff8800'><b>10 seconds</b></font>.</li></ul></font>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Shining in the darkest dark, his eyes pierce the night and sting your soul.&quot;</i></font>",
                        R.drawable.killer_shadowborn, Arrays.asList("Wraith", "Haste"), 18),
                new PerkItem("<font color='#ffffff'><b>SHATTERED HOPE</b></font>",
                        "<font color='#aaa9a9'>To capture your prey, you must first extinguish their hope." +
                                "<ul><li>Whenever you snuff a Boon Totem, the totem is destroyed instead.</li><br>" +
                                "<li>When you destroy a Boon Totem this way, the auras of all Survivors inside the Boon Totem range are revealed to you for " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>8</b></font> seconds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Nothing is permanent here. Nothing except our endless perdition.&quot; —&#8288;Unknown, Notebook</i></font>",
                        R.drawable.killer_shattered_hope, Arrays.asList("Default", "Aura"), 97),
                new PerkItem("<font color='#ffffff'><b>SLOPPY BUTCHER</b></font>",
                        "<font color='#aaa9a9'>You know where to hit to make them bleed." +
                                "<ul><li>Wounds inflicted by basic attacks cause Survivors to suffer from the <font color='#ffffff'><b>Hemorrhage</b></font> and <font color='#ffffff'><b>Mangled</b></font> status effects for " +
                                "<font color='#ffff1a'><b>70</font>/<font color='#199b1e'>80</font>/<font color='#ac3ee3'>90</b></font> seconds.</li><br>" +
                                "<li>Increases the rate at which healing progression is lost from <font color='#ffffff'><b>Hemorrhage</b></font> by <font color='#ff8800'><b>25%</b></font>.</li></ul></font>" + hemorrhage + "<br><br>" + mangled + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;It's in its sadistic nature. There is no swift kill as it delights in the obscene spectacle of our agonizing suffering.&quot;</i></font>",
                        R.drawable.killer_sloppy_butcher, Arrays.asList("Default", "Hemorrhage", "Mangled"), 8),
                new PerkItem("<font color='#ffffff'><b>SPIES FROM THE SHADOWS</b></font>",
                        "<font color='#aaa9a9'>The crows found in the world can communicate with you directly." +
                                "<ul><li><font color='#ff8800'><b>100%</b></font> of the time, cawing crows give you a visual cue when you are within a " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>28</font>/<font color='#ac3ee3'>36</b></font> meter range.</li></ul>" +
                                "<i>Spies From The Shadows</i> has a cooldown of <font color='#ff0808'><b>5 seconds</b></font>.<br><br>" +
                                "<font color='#eeddbe'><i>&quot;In the shadows they torment, scarring our minds with each scream.&quot;</i></font>",
                        R.drawable.killer_spies_from_the_shadows, Arrays.asList("Default"), 9),
                new PerkItem("<font color='#ffffff'><b>SPIRIT FURY</b></font>",
                        "<font color='#aaa9a9'>Each pallet you break magnifies the wrath of The Entity." +
                                "<ul><li>After you break <font color='#ffff1a'><b>4</font>/<font color='#199b1e'>3</font>/<font color='#ac3ee3'>2</b></font> pallets, the next time you are stunned by a pallet, The Entity will instantly break the pallet.</li></ul>" +
                                "You still suffer from the stun effect penalty.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Fury is her blood.&quot;</i></font>",
                        R.drawable.killer_spirit_fury, Arrays.asList("Spirit", "Chase"), 51),
                new PerkItem("<font color='#ffffff'><b>STARSTRUCK</b></font>",
                        "<font color='#aaa9a9'>Your unmatched showmanship dazzles all." +
                                "<ul><li>While carrying a Survivor, any other Survivors within your Terror Radius suffer from the <font color='#ffffff'><b>Exposed</b></font> status effect.</li></ul>" +
                                "The effect persists for <font color='#ffff1a'><b>26</font>/<font color='#199b1e'>28</font>/<font color='#ac3ee3'>30</b></font> seconds on Survivors who leave your Terror Radius, as well as those within the radius when you hook or release the carried Survivor.<br><br>" +
                                "<i>Starstruck</i> has a cooldown of <font color='#ff8800'><b>60 seconds</b></font> once a Survivor is no longer carried.<br><br></font>" + exposed + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Enjoy this moment, few get so close.&quot; —&#8288;Ji-Woon Hak</i></font>",
                        R.drawable.killer_starstruck, Arrays.asList("Trickster", "Carrying", "Exposed", "Terror Radius"), 79),
                new PerkItem("<font color='#ffffff'><b>STRIDOR</b></font>",
                        "<font color='#aaa9a9'>You are acutely sensitive to the breathing of your prey." +
                                "<ul><li>Breathing of Survivors in pain is <font color='#ffff1a'><b>30</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>50</b></font> % louder and regular breathing is " +
                                "<font color='#ffff1a'><b>15</font>/<font color='#199b1e'>20</font>/<font color='#ac3ee3'>25</b></font> % louder.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;If you don't stop and catch your breath... she will.&quot;</i></font>",
                        R.drawable.killer_stridor, Arrays.asList("Nurse", "Chase"), 23),
                new PerkItem("<font color='#ffffff'><b>SUPERIOR ANATOMY</b></font>",
                        "<font color='#aaa9a9'>Decades of research have culminated in you: something faster, stronger, and more dangerous than any human." +
                                "<ul><li>When a Survivor performs a fast vault within <font color='#ff8800'><b>8 meters</b></font> of you, this perk activates. The next time you vault a window, your vaulting speed is increased by " +
                                "<font color='#ffff1a'><b>30</font>/<font color='#199b1e'>35</font>/<font color='#ac3ee3'>40</b></font> %.</li></ul>" +
                                "This perk deactivates after vaulting a window.<br><br>" +
                                "This perk has a <font color='#ff0808'><b>30 second</b></font> cooldown.</font>",
                        R.drawable.killer_superior_anatomy, Arrays.asList("Mastermind", "Chase"), 98),
                new PerkItem("<font color='#ffffff'><b>SURGE</b></font>",
                        "<font color='#aaa9a9'>Your eerie presence charges the air and interferes with technology." +
                                "<ul><li>Putting a Survivor into the dying state with a basic attack causes all generators within a <font color='#ff8800'><b>32&nbsp;meter&nbsp;radius</b></font> to explode instantly and begin regressing. Generators affected by Surge immediately lose " +
                                "<font color='#ffff1a'><b>6</font>/<font color='#199b1e'>7</font>/<font color='#ac3ee3'>8</b></font> % of their progress.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;The creature appears to have some unknown influence over electricity and nearby electronics.&quot; —&#8288;Hawkins National Laboratory</i></font>",
                        R.drawable.killer_surge, Arrays.asList("Demogorgon", "Jolt", "Gen Defense"), 63),
                new PerkItem("<font color='#ffffff'><b>SURVEILLANCE</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability. Any regressing generator will be highlighted by a white aura." +
                                "<ul><li>If the regression is interrupted on a generator, it will be highlighted by a yellow aura for " +
                                "<font color='#ffff1a'><b>8</font>/<font color='#199b1e'>12</font>/<font color='#ac3ee3'>16</b></font> seconds.</li><br>" +
                                "<li>Noises created by generator repairs are audible at an additional <font color='#ff8800'><b>8 meters</b></font>.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;Are you gonna behave?&quot; —&#8288;Amanda Young</i></font>",
                        R.drawable.killer_surveillance, Arrays.asList("Pig", "Gen Defense"), 45),
                new PerkItem("<font color='#ffffff'><b>TERMINUS</b></font>",
                        "<font color='#aaa9a9'>You are a brilliant tactician who prepares for every eventuality.<br><br>" +
                                "When exit gates are powered, this perk activates." +
                                "<ul><li>While <i>Terminus</i> is active, injured, downed and hooked Survivors are inflicted with the <font color='#ffffff'><b>Broken</b></font> status effect until exit gates are open.</li><br>" +
                                "<li>When exit gates are open, Survivors will stay <font color='#ffffff'><b>Broken</b></font> for an additional " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> seconds.</li></ul></font>" + broken,
                        R.drawable.killer_terminus, Arrays.asList("Mastermind", "Broken", "End Game"), 100),
                new PerkItem("<font color='#ffffff'><b>TERRITORIAL IMPERATIVE</b></font>",
                        "<font color='#aaa9a9'>Unlocks potential in one's aura reading ability." +
                                "<ul><li>Survivors' auras are revealed to you for <font color='#ffff1a'><b>4</font>/<font color='#199b1e'>5</font>/<font color='#ac3ee3'>6</b></font> seconds when they enter the basement and you are more than " +
                                "<font color='#ff8800'><b>24 meters</b></font> away from the basement entrance.</li></ul>" +
                                "<i>Territorial Imperative</i> can only be triggered once every <font color='#ff0808'><b>45 seconds</b></font>.</font>",
                        R.drawable.killer_territorial_imperative, Arrays.asList("Huntress", "Aura"), 36),
                new PerkItem("<font color='#ffffff'><b>THANATOPHOBIA</b></font>",
                        "<font color='#aaa9a9'>Their courage fades in the face of undeniable mortality." +
                                "<ul><li>For each injured, dying, or hooked Survivor, all Survivors receive a penalty of " +
                                "<font color='#ffff1a'><b>1</font>/<font color='#199b1e'>1.5</font>/<font color='#ac3ee3'>2</b></font> % to repair, sabotage and Totem-cleansing speeds.</li><br>" +
                                "<li>If there are <font color='#ff8800'><b>4</b></font> injured, dying or hooked Survivors, there is an additional <font color='#ff0808'><b>12%</b></font> penalty to repair, sabotage and Totem cleansing speeds.</li></ul></font>" +
                                "<font color='#eeddbe'><i>&quot;She plays with us and revels in our pain.&quot;</i></font>",
                        R.drawable.killer_thanatophobia, Arrays.asList("Nurse", "Gen Defense"), 24),
                new PerkItem("<font color='#ffffff'><b>THRILLING TREMORS</b></font>",
                        "<font color='#aaa9a9'>Your dark designs and shrewd composure rouse The Entity." +
                                "<ul><li>After picking up a Survivor, all Generators not being repaired by Survivors are blocked by The Entity and cannot be repaired for the next <font color='#ff8800'><b>16 seconds</b></font>. Affected generators are highlighted by a white aura.</li></ul>" +
                                "<i>Thrilling Tremors</i> can only be triggered once every " +
                                "<font color='#ffff1a'><b>100</font>/<font color='#199b1e'>80</font>/<font color='#ac3ee3'>60</b></font> seconds.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;The night assists me and it's endless here.&quot; —&#8288;The Ghost Face</i></font>",
                        R.drawable.killer_thrilling_tremors, Arrays.asList("Ghost Face", "Gen Defense"), 60),
                new PerkItem("<font color='#ffffff'><b>THWACK!</b></font>",
                        "<font color='#aaa9a9'>Your prey is terrified by your relentless pursuit.<br><br>" +
                                "When breaking a pallet or breakable wall, consume a token." +
                                "<ul><li>Survivors within <font color='#ff8800'><b>24&nbsp;meters</b></font> scream, revealing their location for " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> seconds.</li></ul>" +
                                "When hooking a Survivor, regain <font color='#ff0808'><b>1 token</b></font>.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;All those who stood in her path feared her mighty THWACK!&quot; —&#8288;Sonhadores Sombrios, Issue #3</i></font>",
                        R.drawable.killer_thwack, Arrays.asList("Skull Merchant", "Scream"), 105),
                new PerkItem("<font color='#ffffff'><b>TINKERER</b></font>",
                        "<font color='#aaa9a9'><ul><li>Whenever a generator is repaired to <font color='#ff8800'><b>70%</b></font> progress, it triggers a loud noise notification and you are granted the <font color='#ffffff'><b>Undetectable</b></font> status effect for the next " +
                                "<font color='#ffff1a'><b>12</font>/<font color='#199b1e'>14</font>/<font color='#ac3ee3'>16</b></font> seconds.</li></ul>" +
                                "This effect can only be triggered once on each generator.</font>" + "<br><br>" + undetectable + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;The Hillbilly makes impressive tools out of scraps. Tools aimed at maiming us in creative ways...&quot; —&#8288;Notebook</i></font>",
                        R.drawable.killer_tinkerer, Arrays.asList("Hillbilly", "Gen Defense", "Undetectable"), 21),
                new PerkItem("<font color='#ffffff'><b>TRAIL OF TORMENT</b></font>",
                        "<font color='#aaa9a9'>You guide your victims along a path of pain and punishment." +
                                "<ul><li>After damaging a generator, you become <font color='#ffffff'><b>Undetectable</b></font> until the generator stops regressing. During this time, the generator's yellow aura is revealed to Survivors.</li></ul>" +
                                "This effect can only trigger once every <font color='#ffff1a'><b>60</font>/<font color='#199b1e'>45</font>/<font color='#ac3ee3'>30</b></font> seconds.</font><br><br>" + undetectable,
                        R.drawable.killer_trail_of_torment, Arrays.asList("Executioner", "Undetectable"), 72),
                new PerkItem("<font color='#ffffff'><b>ULTIMATE WEAPON</b></font>",
                        "<font color='#aaa9a9'>When they spot you, they know the end is near." +
                                "<ul><li>When you open a locker, all Survivors within <font color='#ff8800'><b>32&nbsp;meters</b></font> of the locker scream and reveal their position, then gain <font color='#ffffff'><b>Blindness</b></font> for <font color='#ff0808'><b>30&nbsp;seconds</b></font>.</li></ul>" +
                                "This perk goes on cooldown for <font color='#ffff1a'><b>80</font>/<font color='#199b1e'>70</font>/<font color='#ac3ee3'>60</b></font> seconds.<br><br>" + blindness + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I can't lie to you about your chances, but... you have my sympathies.&quot; —&#8288;Ash</i></font>",
                        R.drawable.killer_ultimate_weapon, Arrays.asList("Xenomorph", "Blindness", "Scream"), 110),
                new PerkItem("<font color='#ffffff'><b>UNBOUND</b></font>",
                        "<font color='#aaa9a9'>Pain lingers in the air, an alluring aroma that excites the impulses.<br><br>" +
                                "This perk activates for <font color='#ffff1a'><b>24</font>/<font color='#199b1e'>27</font>/<font color='#ac3ee3'>30</b></font> seconds after a Survivor becomes injured by any means." +
                                "<ul><li>After vaulting a window, you gain <font color='#ffff1a'><b>5%</b></font> <font color='#ffffff'><b>Haste</b></font> for <font color='#ff8800'><b>10 seconds</b></font>.</li></ul>" +
                                "This effect cannot stack with itself.</font><br><br>" + haste + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;I heard it. Running. It was getting closer!&quot; —&#8288;Anonymous Testimony, 09/09/1979</i></font>",
                        R.drawable.killer_unbound, Arrays.asList("Unknown", "Chase", "Haste"), 116),
                new PerkItem("<font color='#ffffff'><b>UNDONE</b></font>",
                        "<font color='#aaa9a9'>Hope is the delusion that keeps its victims alive.<br><br>" +
                                "When a Survivor misses a healing or repair Skill Check, gain 3 tokens, up to " +
                                "<font color='#ffff1a'><b>18</font>/<font color='#199b1e'>24</font>/<font color='#ac3ee3'>30</b></font>." +
                                "<ul><li>When you perform the break action on a generator, if you have any tokens, consume all of them. For each token consumed, the generator loses <font color='#ffff1a'><b>1%</b></font> total progress and then becomes blocked for " +
                                "<font color='#ff8800'><b>1&nbsp;second</b></font>.</li></ul>" +
                                "Then, once the generator is unblocked, it starts regressing.<br><br>" +
                                "This perk goes on cooldown for <font color='#ff0808'><b>60&nbsp;seconds</b></font>.</font><br><br>" +
                                "<font color='#eeddbe'><i>&quot;Erratic behavior in machinery could be related to [REDACTED], further testing required.&quot; —&#8288;OSS Report, 12/02/1943</i></font>",
                        R.drawable.killer_undone, Arrays.asList("Unknown", "Gen Defense"), 118),
                new PerkItem("<font color='#ffffff'><b>UNFORESEEN</b></font>",
                        "<font color='#aaa9a9'>Terror takes many forms and whispers devastating lies in its victims' ears." +
                                "<ul><li>When you perform the break action on a generator, your Terror Radius transfers to the generator for " +
                                "<font color='#ffff1a'><b>22</font>/<font color='#199b1e'>26</font>/<font color='#ac3ee3'>30</b></font> seconds and its radius is set to <font color='#ff8800'><b>32&nbsp;meters</b></font>.</li><br>" +
                                "<li>You gain <font color='#ffffff'><b>Undetectable</b></font> for that duration.</li></ul>" +
                                "Then, this perk goes on cooldown for <font color='#ff0808'><b>30&nbsp;seconds</b></font>.<br><br>" + undetectable + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;Mom, if you find this, I'm sorry...&quot; —&#8288;Final Journal Entry, 07/12/1991</i></font>",
                        R.drawable.killer_unforeseen, Arrays.asList("Unknown", "Terror Radius", "Undetectable"), 117),
                new PerkItem("<font color='#ffffff'><b>UNNERVING PRESENCE</b></font>",
                        "<font color='#aaa9a9'>Your presence alone instills great fear." +
                                "<ul><li>Survivors within your Terror Radius have a <font color='#ff8800'><b>10&nbsp;%</b></font> greater chance of triggering Skill Checks when repairing or healing.</li><br>" +
                                "<li>Triggered Skill Checks' success zones are reduced by " +
                                "<font color='#ffff1a'><b>40</font>/<font color='#199b1e'>50</font>/<font color='#ac3ee3'>60</b></font> %.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Its presence befalls us.&quot;</i></font>",
                        R.drawable.killer_unnerving_presence, Arrays.asList("Trapper", "Terror Radius"), 15),
                new PerkItem("<font color='#ffffff'><b>UNRELENTING</b></font>",
                        "<font color='#aaa9a9'>You recuperate faster from missed attacks made with your main weapon." +
                                "<ul><li>The cooldown after missed basic attacks is reduced by " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> %.</li></ul></font>",
                        R.drawable.killer_unrelenting, Arrays.asList("Default", "Chase"), 10),
                new PerkItem("<font color='#ffffff'><b>WEAVE ATTUNEMENT</b></font>",
                        "<font color='#aaa9a9'>You are so attuned to magical energies that you can sense even minor ripples around enchantments." +
                                "<ul><li>When an item becomes depleted for the first time, it is dropped. You see the auras of dropped items.</li><br>" +
                                "<li>Survivors within <font color='#ff8800'><b>12&nbsp;meters</b></font> of dropped items have their auras revealed to you. Affected Survivors see the item's aura.</li><br>" +
                                "<li>When a Survivor picks up a Survivor item, they suffer from the <font color='#ffffff'><b>Oblivious</b></font> status effect for " +
                                "<font color='#ffff1a'><b>20</font>/<font color='#199b1e'>25</font>/<font color='#ac3ee3'>30</b></font> seconds.</li></ul>" + oblivious + "<br><br>" +
                                "<font color='#eeddbe'><i>&quot;No number of novelties will protect you from me!&quot; —&#8288;Vecna</i></font>",
                        R.drawable.killer_weave_attunement, Arrays.asList("Lich", "Aura", "Oblivious"), 119),
                new PerkItem("<font color='#ffffff'><b>WHISPERS</b></font>",
                        "<font color='#aaa9a9'>You have a rudimentary understanding of The Entity's voice." +
                                "<ul><li>Sporadically hear The Entity's whisper when standing within a " +
                                "<font color='#ffff1a'><b>48</font>/<font color='#199b1e'>40</font>/<font color='#ac3ee3'>32</b></font> meter range of a Survivor.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;It's unclear as to the motivations of The Fog, but it is undeniable that it often takes the beast's side.&quot; —&#8288;Notebook</i></font>",
                        R.drawable.killer_whispers, Arrays.asList("Default"), 11),
                new PerkItem("<font color='#ffffff'><b>ZANSHIN TACTICS</b></font>",
                        "<font color='#aaa9a9'>You are mentally alert and aware of nearby enemies in retreat." +
                                "<ul><li>Reveal the aura of pallets and vaults within <font color='#ff8800'><b>32&nbsp;meters</b></font>. Survivors who drop pallets are revealed to you for " +
                                "<font color='#ffff1a'><b>3</font>/<font color='#199b1e'>4</font>/<font color='#ac3ee3'>5</b></font> seconds.</li></ul>" +
                                "<font color='#eeddbe'><i>&quot;Within your enemy's strength is weakness.&quot; —&#8288;Renjiro's Doctrine 12:5</i></font>",
                        R.drawable.killer_zanshin_tactics, Arrays.asList("Oni", "Aura"), 66)
        );
    }
}