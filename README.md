# Andromeda
A work-in-progress virtual personal assistant that learns through interaction. Repository published for demonstration and portfolio purposes. 

The moment I started learning to write code, I knew I wanted to build a virtual assistant. No doubt that every programmer who has watched Iron Man wants to build their own Jarvis. I am currently a student studying Computer Science and Engineering, so I started this project as a practical way to apply the coding practices taught in a software design class sequence. 

**How it works:**
1. English statetments are tokenized into a queue of words. 
2. This queue is retokenized into a "CommandStream" of "Andromedan" words using basic linguistic logic and a dictionary of words the system has memorized.
3. The CommandStream is analyzed one token at a time and the system generates a response. 

**Progress:**
- The tokenizer and "retokenizer" both function. 
- The command "learn: _____ is _____" writes new words into the dictionary for the retokenizer to use
- Start of system for keeping track of individuals, conversation topics, and types of statements (question, statement, task query).
 
