//
//  GameView.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "GameView.h"

@implementation GameView

-(id)initWithFrame:(CGRect)frame{
    if(self = [super initWithFrame: frame]){
        self.backgroundColor = [UIColor blackColor];
    }
    return self;
}

-(void)update{
    // to be implemented
}

// getter methods
-(Player*)getPlayer { return player; }

// setter methods
-(void)setPlayer:(Player*)value { player = value; }

@end