static void generate(int maxlen)
{
    int   alphaLen = strlen(alphabet);
    int   len      = 0;
    char *buffer   = malloc((maxlen + 1) * alphaLen * alphaLen);
    int  *letters  = malloc(maxlen * sizeof(int));

    if (buffer == NULL || letters == NULL) {
        fprintf(stderr, "Not enough memory.\n");
        exit(1);
    }

    // This for loop generates all 1 letter patterns, then 2 letters, etc,
    // up to the given maxlen.
    for (len=1;len<=maxlen;len++) {
        // The stride is one larger than len because each line has a '\n'.
        int i;
        int stride = len+1;
        int bufLen = stride * alphaLen * alphaLen;

        if (len == 1) {
            // Special case.  The main algorithm hardcodes the last two
            // letters, so this case needs to be handled separately.
            int j = 0;
            bufLen = (len + 1) * alphaLen;
            for (i=0;i<alphaLen;i++) {
                buffer[j++] = alphabet[i];
                buffer[j++] = '\n';
            }
            write(STDOUT_FILENO, buffer, bufLen);
            continue;
        }

        // Initialize buffer to contain all first letters.
        memset(buffer, alphabet[0], bufLen);

        // Now in buffer, write all the last 2 letters and newlines, which
        // will after this not change during the main algorithm.
        {
            // Let0 is the 2nd to last letter.  Let1 is the last letter.
            int let0 = 0;
            int let1 = 0;
            for (i=len-2;i<bufLen;i+=stride) {
                buffer[i]   = alphabet[let0];
                buffer[i+1] = alphabet[let1++];
                buffer[i+2] = '\n';
                if (let1 == alphaLen) {
                    let1 = 0;
                    let0++;
                    if (let0 == alphaLen)
                        let0 = 0;
                }
            }
        }

        // Write the first sequence out.
        write(STDOUT_FILENO, buffer, bufLen);

        // Special case for length 2, we're already done.
        if (len == 2)
            continue;

        // Set all the letters to 0.
        for (i=0;i<len;i++)
            letters[i] = 0;

        // Now on each iteration, increment the the third to last letter.
        i = len-3;
        do {
            char c;
            int  j;

            // Increment this letter.
            letters[i]++;

            // Handle wraparound.
            if (letters[i] >= alphaLen)
                letters[i] = 0;

            // Set this letter in the proper places in the buffer.
            c = alphabet[letters[i]];
            for (j=i;j<bufLen;j+=stride)
                buffer[j] = c;

            if (letters[i] != 0) {
                // No wraparound, so we finally finished incrementing.
                // Write out this set.  Reset i back to third to last letter.
                write(STDOUT_FILENO, buffer, bufLen);
                i = len - 3;
                continue;
            }

            // The letter wrapped around ("carried").  Set up to increment
            // the next letter on the left.
            i--;
            // If we carried past last letter, we're done with this
            // whole length.
            if (i < 0)
                break;
        } while(1);
    }

    // Clean up.
    free(letters);
    free(buffer);
}
