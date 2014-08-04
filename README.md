POSTagger
=========

Part of Speech Tagger

Uses hidden markov models (HMM's) to classify parts of speech in sentences. Pretty basic implementation but CV shows ~95% accuracy which is pretty cool.

For the training data, we use the [Brown corpus](http://en.wikipedia.org/wiki/Brown_Corpus#Part-of-speech_tags_used), using [Natural Language Processing with Python](http://www.nltk.org/book/ch08.html) as guidance.

Here are some examples of tags and their expansions:

Tag | Meaning | Examples
ADJ | adjective | new, good, high, special, big, local
ADV | adverb | really, already, still, early, now
CNJ | conjunction | and, or, but, if, while, although
DET | determiner | the, a, some, most, every, no
EX | existential | there, there's
FW | foreign word | dolce, ersatz, esprit, quo, maitre


