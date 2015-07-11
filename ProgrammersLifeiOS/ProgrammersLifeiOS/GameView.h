//
//  GameView.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "Player.h"
#import "MonthCalendar.h"
#import "TimeStamp.h"

@interface GameView : UIView{
    Player *player;
    MonthCalendar *calendar;
    TimeStamp *time;
}

-(void)initialize;

// getter methods
-(Player*)getPlayer;
-(MonthCalendar*)getCalendar;
-(TimeStamp*)getTime;

// setter methods
-(void)setPlayer:(Player*)value;
-(void)setCalendar:(MonthCalendar*)value;
-(void)setTime:(TimeStamp*)value;

@end