//
//  MonthCalendar.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "EventController.h"

@interface MonthCalendar : NSObject{
    EventController *eventReference;
    NSMutableArray *days;
    NSString *title;
    int currentMonth;
}

-(void)initializeFromBeginning;
-(void)initializeMonth;

// getter methods
-(NSMutableArray*)getDays;
-(NSString*)getTitle;
-(int)getCurrentMonth;

// setter methods
-(void)setEventReference:(EventController*)value;
-(void)setDays:(NSMutableArray*)value;
-(void)setTitle:(NSString*)value;
-(void)setCurrentMonth:(int)value;

@end