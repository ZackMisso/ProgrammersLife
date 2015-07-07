//
//  TimeStamp.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface TimeStamp : NSObject{
    int day;
    int month;
    int year;
}

// getter methods
-(int)getDay;
-(int)getMonth;
-(int)getYear;

// setter methods
-(void)setDay:(int)value;
-(void)setMonth:(int)value;
-(void)setYear:(int)value;

@end
