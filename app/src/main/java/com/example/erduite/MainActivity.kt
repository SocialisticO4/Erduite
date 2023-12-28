package com.example.erduite

import androidx.compose.foundation.verticalScroll
import androidx.navigation.compose.rememberNavController
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ErduiteApp()
            }
        }
    }
}

@Composable
fun ErduiteApp(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "main_screen") {
        composable("main_screen") { MainScreen(navController) }
        composable("week_1_parts_of_speech") { Week1Screen(topic = "Parts of Speech") }
        composable("week_1_articles") { Week1Screen(topic = "Articles") }
        composable("week_2_tenses") { Week2Screen(topic = "Tenses") }
        composable("week_3_sentence_formation") { Week3Screen(topic = "Sentence Formation") }
        composable("week_4_finding_errors") { Week4Screen(topic = "Finding Errors") }
    }
}

@Composable
fun Week2Screen(topic: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Week 2 - Tenses")
        Spacer(modifier = Modifier.height(16.dp))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) { // Add scrolling for Week 2
            // Replace this with your existing Week 2 content
            Text("Time Travel with Tenses: Mastering Verb Magic\n" +
                    "Imagine language as a time machine, and verbs are the fuel that power it. Tenses help us navigate through past, present, and future, ensuring our stories stay clear and consistent. Buckle up, as we explore the four main verb tenses in a single page!\n" +
                    "\n" +
                    "1. Present Tense:\n" +
                    "\n" +
                    "Spotlight on now: Used for actions happening right now, habitual actions, or timeless truths.\n" +
                    "Examples:\n" +
                    "I eat breakfast every morning. (habit)\n" +
                    "The sun shines brightly. (timeless truth)\n" +
                    "She is writing a letter. (present action)\n" +
                    "2. Past Tense:\n" +
                    "\n" +
                    "Rewind to yesterday: Used for completed actions or events in the past.\n" +
                    "Examples:\n" +
                    "I studied hard for the exam. (completed action)\n" +
                    "The dinosaurs lived millions of years ago. (past event)\n" +
                    "They built the pyramids centuries ago. (past action)\n" +
                    "3. Future Tense:\n" +
                    "\n" +
                    "Fast forward to tomorrow: Used for actions or events yet to happen.\n" +
                    "Examples:\n" +
                    "I will visit my family next week. (planned future action)\n" +
                    "The train leaves in five minutes. (scheduled future event)\n" +
                    "Technology will advance rapidly in the coming years. (predicted future event)\n" +
                    "4. Perfect Tense:\n" +
                    "\n" +
                    "Combines past and present: Shows a completed action with ongoing relevance or a connection to the present.\n" +
                    "Examples:\n" +
                    "I have finished my homework. (completed action with present relevance)\n" +
                    "She has lived here for ten years. (past action with ongoing connection to present)\n" +
                    "They have been waiting for hours. (ongoing action started in the past)\n" +
                    "Bonus Tip: Each tense has multiple forms (simple, continuous, perfect continuous) that add specific nuances to the meaning.\n" +
                    "\n" +
                    "Remember: Mastering tenses takes practice! Read, write, and speak actively, paying attention to how verb forms change with time. Soon, you'll be a time-traveling wordsmith, weaving captivating narratives across any era!")
        }
    }
}






@Composable
fun Week4Screen(topic: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Week 4 - Finding Errors")
        Spacer(modifier = Modifier.height(16.dp))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) { // Add scrolling for Week 4
            Text("Error Detectives: Hunting Mistakes in Sentence Jungle!\n" +
                    "Ready to sharpen your grammatical eagle eyes and become a sentence sleuth? We're diving into the wild (and sometimes wonky) world of finding errors, with plenty of content and practice to unleash your inner error-busting hero!\n" +
                    "\n" +
                    "Types of Errors in Sentenceland:\n" +
                    "\n" +
                    "Grammar Gremlins: These pesky critters mess with basic rules like subject-verb agreement, verb tense consistency, and pronoun clarity. Think misplaced modifiers (\"The dog chased the ball, panting excitedly\") or comma chaos (\"They went to the store, bought groceries, and then cooked dinner\").\n" +
                    "Punctuation Poachers: These bandits steal or misplace vital punctuation marks like commas, periods, and apostrophes. Watch out for missing periods (\"I love cats so much\") or rogue commas interrupting natural flow (\"The movie, was very long, and boring\").\n" +
                    "Word Wranglers: These tricksters play with word choice, leading to confusion or awkwardness. Beware of homophones (\"Their, there, and they're all confusing!\") or unnecessary jargon (\"The meeting was very synergistically productive\").\n" +
                    "Clarity Crooks: These shady characters obscure meaning with ambiguity or confusing sentence structure. Tackle dangling modifiers (\"Disappointed, the story never reached a climax\") or unclear pronouns (\"We saw him at the park, and he waved\").\n" +
                    "Sample Sentence Hunts:\n" +
                    "\n" +
                    "Sentence: \"The cat and the dog, which played outside all day, were tired.\" (Can you spot the misplaced modifier?)\n" +
                    "Sentence: \"She went shopping, got groceries, cooked dinner, and then ate.\" (Punctuation poacher alert! What's missing?)\n" +
                    "Sentence: \"Their new project involves utilizing cutting-edge technology.\" (Word wrangler on the loose! Can you find a simpler phrase?)\n" +
                    "Sentence: \"Reading the book, I realized it was written in a very convoluted style.\" (Clarity crook hiding! How can we make this sentence clearer?)\n" +
                    "Bonus Practice:\n" +
                    "\n" +
                    "Create your own \"Find the Error\" challenges for friends or classmates.\n" +
                    "Analyze sentences from books, movies, or even your own writing.\n" +
                    "Play online grammar games or use interactive error-checking tools.\n" +
                    "Remember, finding errors isn't about nitpicking; it's about polishing your writing and enhancing clarity.\n" +
                    "Empower yourself to become a sentence super sleuth! The more you practice, the sharper your error-detecting skills will become. Remember, clear and confident communication starts with mastering the art of finding and fixing those sneaky sentence stumbles. Happy hunting!\n" +
                    "\n" +
                    "I hope this content equips you with the knowledge and practice to confidently seek out sentence errors. Remember, it's a continuous learning process, so embrace the fun and keep your grammar radar on high alert!")

        }
    }
}

@Composable
fun Week3Screen(topic: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Week 3 - Sentence Formation")
        Spacer(modifier = Modifier.height(16.dp))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) { // Enclose content in scrollable column
           Text("Sentence Safari: Unleashing Your Inner Word Explorer!\n" +
            "Ready to transform those jumbled words into majestic sentences? Buckle up, because we're embarking on a sentence safari, where grammar meets fun and examples become your jungle gym!\n" +
                    "\n" +
                    "Ingredients for Sentence Success:\n" +
                    "\n" +
                    "Nouns: The stars of the show, the who, what, and where of your story. Think lions, zebras, or maybe even a mischievous monkey!\n" +
                    "Verbs: The action heroes, making things happen (or not happening!). Running, roaring, or maybe swinging from vines, verbs bring your story to life.\n" +
                    "Adjectives and Adverbs: The colorful sprinkles, adding pizzazz and detail. Describe that lion's mane as \"fiery\" or make that zebra gallop \"wildly.\"\n" +
                    "Connective Tissue: Prepositions and conjunctions like \"in,\" \"on,\" \"and,\" and \"but\" weave your words together, building bridges between jungle creatures.\n" +
                    "Example Escapades:\n" +
                    "\n" +
                    "Simple Sentence: \"The hungry lion roared.\" (Short and sweet, like a quick glimpse of a zebra.)\n" +
                    "Compound Sentence: \"The monkeys chatted and swung through the trees, while the sleepy crocodile lazed nearby.\" (Connecting two scenes with \"and.\")\n" +
                    "Complex Sentence: \"Although the zebra shivered with fear, it galloped bravely past the hungry lion.\" (Subordinate clause adds depth.)\n" +
                    "Question Quest:\n" +
                    "\n" +
                    "Can you turn \"The parrot squawked loudly\" into a sentence with an adjective and an adverb? (Hint: Think about the parrot's voice and how it squawked.)\n" +
                    "Combine these two sentences: \"The snake slithered silently. The frog croaked in the pond.\" (Use a conjunction to create a smooth flow.)\n" +
                    "Imagine a mischievous monkey stealing a tourist's hat. Write a sentence using all eight parts of speech!\n" +
                    "Bonus Fun:\n" +
                    "\n" +
                    "Play \"Mad Libs\" with sentence templates!\n" +
                    "Invent silly creatures and describe them in detail.\n" +
                    "Create a comic strip with word bubbles for your sentence stars.\n" +
                    "Remember, sentence formation is an adventure! Embrace the fun, experiment, and don't be afraid to get a little wild with your words. Soon, you'll be crafting captivating sentences that paint vivid pictures and take your readers on unforgettable journeys.\n" +
                    "\n" +
                    "Let the sentence safari begin! Roar with creativity, chirp with confidence, and remember, the jungle of language awaits your exploration!\n" +
                    "\n" +
                    "I hope this adds a dash of excitement to your grammar journey! Keep exploring, experimenting, and having fun with words!")

        }
    }
}



@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(), // Correct modifier usage
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedButton(onClick = { navController.navigate("week_1_parts_of_speech") }) {
            Text("Week 1 - Parts of Speech")
        }
        Spacer(modifier = Modifier.height(16.dp)) // Correct usage of modifier
        OutlinedButton(onClick = { navController.navigate("week_1_articles") }) {
            Text("Week 1 - Articles")
        }
        Spacer(modifier = Modifier.height(16.dp)) // Correct usage of modifier

        OutlinedButton(onClick = { navController.navigate("week_2_tenses") }) {
            Text("Week 2 - Tenses")
        }
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(onClick = { navController.navigate("week_3_sentence_formation") }) {
            Text("Week 3 - Sentence Formation")
        }
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(onClick = { navController.navigate("week_4_finding_errors") }) {
            Text("Week 4 - Finding Errors")
        }
    }
}




@Composable
fun Week1Screen(topic: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Week 1 - $topic")
        Spacer(modifier = Modifier.height(16.dp))

        // Apply verticalScroll modifier for scrolling
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            when (topic) {
                "Parts of Speech" -> Text(
                    "Imagine a sentence as a bustling city. Nouns are the skyscrapers, towering names of people, places, things, and ideas. Verbs are the bustling traffic, showing actions and states of being. Adjectives and adverbs are the vibrant street art, adding vivid details and direction. Prepositions and conjunctions are the connecting bridges, guiding us through the scene. And finally, interjections are the spontaneous shouts, bursts of surprise or emotion.\n" +
                            "\n" +
                            "Each of these roles, called parts of speech, serves a vital function in building sentences and conveying meaning. Here's a quick breakdown of the eight main characters:\n" +
                            "\n" +
                            "1. Nouns: The kings and queens of the sentence, identifying who or what the story revolves around.\n" +
                            "\n" +
                            "Examples: dog, book, happiness, journey\n" +
                            "2. Pronouns: The loyal subjects, standing in for nouns to avoid repetition.\n" +
                            "\n" +
                            "Examples: she, it, them, anyone\n" +
                            "3. Verbs: The engines of action, showing what happens or exists.\n" +
                            "\n" +
                            "Examples: run, think, shine, be\n" +
                            "4. Adjectives: The colorful decorators, adding descriptive flourishes to nouns.\n" +
                            "\n" +
                            "Examples: tall, wise, sparkling, mysterious\n" +
                            "5. Adverbs: The nimble modifiers, describing verbs, adjectives, and even other adverbs.\n" +
                            "\n" +
                            "Examples: quickly, very, often, surprisingly\n" +
                            "6. Prepositions: The invisible bridges, showing relationships between words and things.\n" +
                            "\n" +
                            "Examples: on, in, with, to, by\n" +
                            "7. Conjunctions: The linking hands, joining words, phrases, and clauses.\n" +
                            "\n" +
                            "Examples: and, but, or, because, however\n" +
                            "8. Interjections: The exclamation points, expressing sudden emotions or reactions.\n" +
                            "\n" +
                            "Examples: Wow! Ouch! Hooray!\n" +
                            "Bonus Tip: Some words can play multiple roles! For example, \"run\" can be a verb or a noun, depending on context.\n" +
                            "\n" +
                            "Remember, mastering these eight parts of speech unlocks the fascinating world of sentence construction and clear communication. So, keep exploring, and have fun building your own linguistic city!\n" +
                            "\n"
                )

                "Articles" -> Text("\n" +
                        "Articles: Tiny Words, Big Impact\n" +
                        "Articles are those little words – \"a,\" \"an,\" \"the\" – that seem insignificant, but pack a big punch in shaping meaning.\n" +
                        "\n" +
                        "Types:\n" +
                        "\n" +
                        "Definite (the): Introduces a specific, unique noun: \"The cat sleeps on the rug.\"\n" +
                        "Indefinite (a/an): Introduces a non-specific noun: \"A bird chirps in the tree.\"\n" +
                        "Zero article: Used with mass nouns and uncountable things: \"Love is blind.\"\n" +
                        "Functions:\n" +
                        "\n" +
                        "Identify specificity: Define whether the noun is known or unknown to the reader.\n" +
                        "Countability: Indicate whether the noun is singular or plural, countable or uncountable.\n" +
                        "Clarity: Avoid awkwardness and repetition, especially with repeated nouns.\n" +
                        "Usage tips:\n" +
                        "\n" +
                        "\"The\" is used for unique things: \"the sun,\" \"the Mona Lisa.\"\n" +
                        "\"A/an\" are used for general or unfamiliar things: \"a book,\" \"an idea.\"\n" +
                        "No article is used for abstract or mass nouns: \"honesty,\" \"water.\"\n" +
                        "Exceptions abound: proper nouns, materials, some titles usually don't have articles.\n" +
                        "Bonus knowledge:\n" +
                        "\n" +
                        "\"An\" is used before vowel sounds (\"an apple\") and silent \"h\" (\"an honor\").\n" +
                        "Articles can even influence meaning: \"a problem\" vs. \"the problem.\"")
            }
        }
    }


}
