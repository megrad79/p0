// Udacity Practice - Counts the level of blocks in a pyramid
public int countBlocks(int levels){
    int total =0;
    
    for(int i=0; i <= levels; i++){
        total += (i*i);
    }

    return total;
}
