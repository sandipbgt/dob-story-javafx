package com.sandipbhagat.model;

/**
 * Created by sandip on 8/12/15.
 */
public class Story {

    private static final String[] stories = {
            // If U were born on the 1st, 10th, 19th, 28th of any month
            "You are smart, straight talking, funny, stubborn, hardworking, honest, jealous on competing basis, kind hearted, angry, friendly, authorities, famous person.\n" +
            "You always want to be and regarded as first on people position, they are often like to be independent, will never be under others, self confident people!\n" +
            "You are most likely to fall in love in the younger age, but will get marry when you mature! You are likely to have problems with people who have opposite views And you are most likely to take revenge over your enemies in a long time basis.\n" +
            "You are a spender, but you will have a good profession in the future.\n" +
            "If you are guy you will be very popular that everybody will have mental attraction and respect at you.\n" +
            "You can go anywhere from the local shop to the heart of the parliament because you are positive and well talented in numerous issues!! But in your life you will always have some people who will work hard to bring you & your name down. This is undercover!! Coz of your smart behavior you will be hated by some people too...\n" +
            "Your family life is very cool, you will have a very nice partner & wonderful children... You are pioneer, independent & original...\n" +
            "\n" +
            "Your best match is 4,6,8 good match is 3,5,7 !!!",

            // If U were born on the 2nd, 11th, 20th, 29th of any month
            "No matter what, you will be loved by every one coz your ruler is the moon and every one loves the Moon.\n" +
            "Well.. You are a person who day dream a lot, you have very low-self confidence, you need back up for every move in your life, you are very much unpredictable. Means you do change according to time and circumstances.\n" +
            "Kind a selfish, have a very strong sense of musical, artistic talent, verbal communication.\n" +
            "Your attitudes are like the Moon, comes to gloom and fade away so everybody can expect changes in you.\n" +
            "You can be a next Mahatma Gandhi who does peace love or you can be a Hitler who wants to destroy the man kind and peace (I mean in the community and your own home).\n" +
            "If you really have a deep thought about your own believe in God you can feel the difference which will make you stronger!\n" +
            "Most of the time your words are a kind of would be happening true! So without any knowledge you can predict the situation.\n" +
            "You will become poets, writers, any Artistic businesspeople!\n" +
            "You are not strong in love, so you will be there and here till you get marry.. If U r a girl you will be a responsible woman in the whole family.\n" +
            "If you are a man you will involve in fights & arguments in the family or Vice-versa. Means you will sacrifice your life for the goodness sake of your family...\n" +
            "You are gentle , intuitive with a broad vision, a power behind the scenes, well balanced people!!!\n" +
            "\n" +
            "Your best match is 2 ,5 ,9 no other people can put up with you !!!",

            // If U were born on the 3rd, 12th, 21st, 30th of any month
            "You are a person of hard hearted, selfish most of the times, religious, loves to climb up in your life.\n" +
            "You always tend to have lots of problems within your family in the early stages but you will put up with everything.\n" +
            "You have the strong word power, pretty happy face.. So wherever you go always you have got what you wanted!!! And from the birth always wanted to work hard in order to achieve something..\n" +
            "You will not get anything without hard work!\n" +
            "When you reach a man/woman age you want other younger once to listen to you because you want younger people to respect people older than them. You do set so many examples to others.\n" +
            "Generally you are not a cool person. It's not easy thing dealing with you. A tough player you are! But once you like someone's attitude then here you\n" +
            "go, what can I say? It will be a lasting friendship. You always have respect from others.\n" +
            "Your life seems to have lots of worries and problems but sure they won't be long.. you will always have brilliant kids!!!\n" +
            "You love the money a bit too much so temptation will push you to endless trying and trying..\n" +
            "If you are a guy then it's over. Looking after your family and help friends, so you will spend a life time just being generous and kind (except 21st born men). And number 3s you will\n" +
            "be such an example of how to be in the culture & life!!!\n" +
            "If you are girl then you have good character and culture & hardworking attitude. You always follow.\n" +
            "You are a freedom lover, creative, ambition focused, a person who brings beauty , hope & joy to this world!!!\n" +
            "\n" +
            "Your best match 6 ,9. Good match 1 ,3 ,5 !!!",

            // If U were born on the 4th, 13th, 22nd, 31st of any month
            "You are very stubborn too, very hard working but unlucky in important matters in life, very cool, helpful, you have rough word power..\n" +
            "Might put lots of people away from you, you may cause nuisance to others if you are a man, and you often understands others and their problems well.\n" +
            "If you are a girl you are very good with studies and arts.\n" +
            "If you are a guy you spend most of the time after girl friends (almost) at times, you will have sort of too much fun life with mates & girls.\n" +
            "Your friends will spend your time & money and get away with their life and you will become empty handed and don't know what to do... So be careful!! You love to spend anyway!!!\n" +
            "Your good will is you are always there to help family and friends. Tell you what you people are little gem! , specially the girls..\n" +
            "You always fall in love in younger age as well. You often live with disappointments, for an example you have got a degree in some thing... but you will be unemployed.. or will do very ordinary jobs.\n" +
            "But you will take care of your family very well...All you need to be careful of people who will take advantage of your kind heart. And beware of your relations too..\n" +
            "You are radical, patient, persistent,a bit old-fashioned, you live with foundation & order...\n" +
            "\n" +
            "Your best Match 1, 8. Good match 5 ,6 , 7 !!!",

            // If U were born on the 5th, 14th, 23rd of any month
            "You are very popular within the community, you can get things done by just chatting..to even enemies!\n" +
            "You have a pretty good business mind, you are often have no-idea what is today is like, or tomorrow is like.\n" +
            "You are a person who does anything when your head thinks \"lets do this\".\n" +
            "You will be famous if you open up a business, get involve in share dealings, music etc..\n" +
            "Very popular with sense of humor ,you are the one your friends and families will always ask for help, and you are the one actually get money on credit and help your friends.\n" +
            "You will have more than 1 relationship, but when you get settle down you will be a bit selfish anyway. Coz your other half will have a pretty good amount of control in you, be careful!\n" +
            "You tend to go for other relationships contacts even you are married at times 'coz your popularity..\n" +
            "You are someone who get along with anyone coz the number 5 is the middle number..\n" +
            "Changes & freedom lovers you are! You are an explorer with magic on your face.\n" +
            "You learn your life through experience and it's your best teacher!!!\n" +
            "\n" +
            "Your best match 1 ,2 ,9. Good match 6 ,8 !!!",

            // If U were born on the 6th, 15th, 24th of any month
            "Ooopppss..you are born to enjoy.. You don't care about others. I mean you are always want to enjoy your life time, you are a person..\n" +
            "You will be very good in either education or work wise or business management!\n" +
            "You are talented, kind (but with only people who you think are nice), very beautiful girls and guys, popular and more than lucky with anything in your lives.\n" +
            "All the goodness does come with you. Your mind and body is just made perfect for love.\n" +
            "You are lovable by any other numbers. But if you are a number 6 man, you will experience kind of looks from most girls and will involve in more than\n" +
            "few relationships until you get married.\n" +
            "If you are girl, most of you will get marry/engaged early. You are a caring person towards your family & friends.\n" +
            "If you miss the half-way mark then you are about to suffer physically and mentally.\n" +
            "Generally you will lead a very good inner-home happiness with nothing short of.\n" +
            "You are a person of compassion, comfort & fairness, domestic responsibility, good judgment, and after all you can heal this world wounds to make peace for every life coz you have the great power of caring talent to make this world of love one step further...\n" +
            "\n" +
            "Your best match 1, 6, 9. Good match 4, 5 !!!",

            // If U were born on the 7th, 16th, 25th of any month
            "You have got the attraction to anyone out there, you are realistic, very confident, happy, such a talented individual with your education, music, arts,\n" +
            "singing, and most importantly acting too.\n" +
            "You have real problems with bad temper! If you are a girl, you are popular with the subjects listed above.\n" +
            "You give up things for your parents. I mean you value your family status a lot, you will be in the top rank when you reach a certain age.\n" +
            "If you are a guy you are popular with girls, you are a very talented too.\n" +
            "Most of the number 7s face lots of problems with their marriage life.\n" +
            "Only a very few are happy. You have everything in your life, but still always number 7s have some sort of unfullfilness, such worries all their lifetime.\n" +
            "It's probably the Lord given you all sort of over the standard humans talents and you are about to suffer in family life. So you need to get ready\n" +
            "looking for a partner rather than waiting. If you don't, then you might end-up single. So take care with this issue, ok?\n" +
            "You are wonderful, friendly, artistic, happy person.. You are born to contribute lots to this world!!!\n" +
            "\n" +
            "Your best match is 2. Good matches are 1,4 !!!",

            // If U were born on the 8th,17th,26th of any month
            "You are a very strong personality, there's no one out there will understand you.\n" +
            "You are very good at pointing your finger at some thing and say \"this is what\".\n" +
            "You are more likely to suffer from the early ages. I mean poverty.\n" +
            "If your times are not good you might lose either of your parent and end up looking after your entire family.\n" +
            "You often suffer all the way in life. The problems will not allow you to study further, but you will learn the life in a very practical way.\n" +
            "You are the one who will fight for justice and may die in the war too.\n" +
            "You are normally very reserved with handful of friends and most of the time live life lonely and always prepared to help others.\n" +
            "Well. once you get married (which is often late) then your bad lucks will go away a bit and you become safe.\n" +
            "You will face un-expected problems such as : the error, government, poisonous animals, accidents.\n" +
            "You are some one with great discipline, persistence, courage, strength which will take you to success.\n" +
            "You are a great part of a family team. You are a fighter!\n" +
            "\n" +
            "Your Best match 1 ,4, 8. Good match 5 !!!",

            // If U were born on the 9th,18th,27th of any month
            "Hey...you guys are the incompatibles people in the world. You are so strong, physically and mentally...\n" +
            "You are often have big-aims. You will work hard and hard to get there.\n" +
            "Normally you suffer in the early age from family problems and generally you will have fighting life.. But when you achieve what you have done, it's always a big task you have done!\n" +
            "You are so much respected in the community, you are a person who can make a challenge and successfully finish the matter off.\n" +
            "You are very naughty in your younger age, often beaten up by your parents and involve in fights and you seemed to have lots of injuries in your life time. But when u grow you become calm and macho type.\n" +
            "Love is not an easy matter for you. You are good in engineering or banking jobs coz people always trust you.\n" +
            "Your family life is very good, but will have worries over your children.\n" +
            "Your such qualities are humanitarian, patient, very wise & compassionate.\n" +
            "You are born to achieve targets and serve every one all equally without any prejudice.\n" +
            "You are totally a role model to anybody in the world for a great inspiration.\n" +
            "\n" +
            "Your Best match 3, 5, 6, 9. Good match 2"
    };

    public static String fromBirthDate(int birthDay) {

        switch (birthDay) {

            case 1:
            case 10:
            case 19:
            case 28:
                return stories[0];

            case 2:
            case 11:
            case 20:
            case 29:
                return stories[1];

            case 3:
            case 12:
            case 21:
            case 30:
                return stories[2];

            case 4:
            case 13:
            case 22:
            case 31:
                return stories[3];

            case 5:
            case 14:
            case 23:
                return stories[4];

            case 6:
            case 15:
            case 24:
                return stories[5];

            case 7:
            case 16:
            case 25:
                return stories[6];

            case 8:
            case 17:
            case 26:
                return stories[7];

            case 9:
            case 18:
            case 27:
                return stories[8];

            default:
                return "invalid birth date";
        }
    }

}
