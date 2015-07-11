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
        [self initialize];
    }
    return self;
}

-(void)initialize{
    self.backgroundColor = [UIColor blackColor];
    // to be implemented
}

-(void)update{
    // to be implemented
}

// getter methods
-(Player*)getPlayer { return player; }
-(MonthCalendar*)getCalendar { return calendar; }
-(TimeStamp*)getTime { return time; }

// setter methods
-(void)setPlayer:(Player*)value { player = value; }
-(void)setCalendar:(MonthCalendar*)value { calendar = value; }
-(void)setTime:(TimeStamp*)value { time = value; }

@end